package pujiwahono.app.advancepuji.presenter.main;

import com.google.gson.Gson;

import okhttp3.Request;
import pujiwahono.app.advancepuji.models.main.MainModel;
import pujiwahono.app.advancepuji.models.main.MainModelImp;
import pujiwahono.app.advancepuji.utils.OkHttpTime;
import pujiwahono.app.advancepuji.utils.RxOkhttp;
import pujiwahono.app.advancepuji.view.main.MainView;
import rx.Observable;

/**
 * Created by evpuji2017 on 5/26/17.
 */

public class MainPresenterImp implements MainPresenter{

    MainModel model;
    MainView view;

    public MainPresenterImp(MainView view) {
        model = new MainModelImp();
        this.view = view;
    }

    @Override
    public Observable<MainModelImp> getResult() {
        Request request = model.build();
        return  RxOkhttp.streamStrings(OkHttpTime.client, request).map(s ->
            new Gson().fromJson(s, MainModelImp.class));

    }
}
