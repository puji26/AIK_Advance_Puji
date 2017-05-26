package pujiwahono.app.advancepuji.view.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import pujiwahono.app.advancepuji.base.BaseActivity;
import pujiwahono.app.advancepuji.models.MainModelImp;
import pujiwahono.app.advancepuji.presenter.main.MainPresenter;
import pujiwahono.app.advancepuji.presenter.main.MainPresenterImp;
import pujiwahono.app.advancepujilistlaptop.R;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends BaseActivity implements MainView{

    private final String TAG = "MainActivity";

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind(R.layout.activity_main);

    }

    @Override
    public void onSuccess(MainModelImp result) {

    }

    @Override protected void onDestroy() {
        super.onDestroy();
    }





    @Override
    public void onError(Throwable err) {
        Log.e(TAG, err.getMessage());
    }
}
