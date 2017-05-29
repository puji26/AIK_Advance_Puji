package pujiwahono.app.advancepuji.view.fragment;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import pujiwahono.app.advancepuji.holder.MainListHolder;
import pujiwahono.app.advancepuji.models.dialogdetail.DialogDetailModelImp;
import pujiwahono.app.advancepuji.presenter.dialogdetail.DialogDetailPresenterImp;
import pujiwahono.app.advancepujilistlaptop.R;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by evpuji2017 on 5/28/17.
 */

public class DialogDetail extends DialogFragment implements DialogDetailView  {

    private final String TAG = "DialogDetail";

    @BindView(R.id.editTxtModelName) EditText editModelName;

    @BindView(R.id.editTxtRam) EditText editRam;

    @BindView(R.id.editTxtOS) EditText editOs;

    @BindView(R.id.editTxtPrice) EditText editPrice;

    @BindView(R.id.editTxtScreenSize) EditText editScreensize;

    @BindView(R.id.editTxtBrand) EditText editBrand;

    private Subscription subscriber = new CompositeSubscription();

    @Nullable @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_detail, null);
    }

    @Override public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        String id = getArguments().getString("id");
        subscriber = new DialogDetailPresenterImp(this)
                .getResult(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccess, this::onError);
    }

    @Override public void onDestroyView(){
        super.onDestroyView();
        subscriber.unsubscribe();
    }


    @Override
    public void onSuccess( DialogDetailModelImp result) {
        editModelName.setText(result.getData().getModelname());
        editRam.setText(result.getData().getRam());
        editOs.setText(result.getData().getOs());
        editPrice.setText(result.getData().getPrice());
        editScreensize.setText(result.getData().getScreensize());
        editBrand.setText(result.getData().getBrand());

    }

    @Override
    public void onError(Throwable err) {
        Log.e(TAG, err.getMessage());
    }
}
