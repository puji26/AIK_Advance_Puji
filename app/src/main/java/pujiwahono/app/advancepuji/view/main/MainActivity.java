package pujiwahono.app.advancepuji.view.main;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import butterknife.BindView;
import pujiwahono.app.advancepuji.adapter.ListAdapter;
import pujiwahono.app.advancepuji.base.BaseActivity;
import pujiwahono.app.advancepuji.holder.MainListHolder;
import pujiwahono.app.advancepuji.models.main.MainModelImp;
import pujiwahono.app.advancepuji.presenter.main.MainPresenter;
import pujiwahono.app.advancepuji.presenter.main.MainPresenterImp;
import pujiwahono.app.advancepuji.view.fragment.DialogDetail;
import pujiwahono.app.advancepujilistlaptop.R;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends BaseActivity implements MainView{
    Context context;
    private final String TAG = "MainActivity";

    private MainPresenter mainPresenter;

    private ListAdapter adapter;

    @BindView(R.id.lst_laptop) RecyclerView lstlaptop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind(R.layout.activity_main);

        mainPresenter = new MainPresenterImp(this);
        subscriber = mainPresenter.getResult()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccess, this::onError);


    }

    @Override
    public void onSuccess(MainModelImp result) {


         lstlaptop.setLayoutManager(new LinearLayoutManager(this));

         adapter = new ListAdapter<MainModelImp.Data, MainListHolder>(R.layout.item_list, MainListHolder.class, MainModelImp.Data.class, result.getData()) {
             @Override
             protected void bindView(MainListHolder holder, MainModelImp.Data model,final int position) {
                 holder.bind(model.getModelname());
                 holder.bRam(model.getRam());
                 holder.bOS(model.getOs());
                 holder.bPrice(model.getPrice());
                 holder.bScreensize(model.getScreensize());
                 holder.bBrand(model.getBrand());

                 holder.getItemLisLaptop().setOnClickListener(v -> {
                     DialogDetail detail = new DialogDetail();
                     Bundle bundle = new Bundle();
                     bundle.putString("id", String.valueOf(model.getId()));

                     detail.setArguments(bundle);
                     detail.show(getFragmentManager(), "Detail");

                     System.out.print(bundle);

                 });


             }

         };
        lstlaptop.setAdapter(adapter);

        Toast.makeText(this, "Show Data List Laptop", Toast.LENGTH_LONG).show();
    }

    @Override protected void onDestroy() {
        super.onDestroy();


    }


    @Override
    public void onError(Throwable err) {



        Log.e(TAG, err.getMessage());

        Toast.makeText(this, "Error Connection", Toast.LENGTH_LONG).show();
    }
}
