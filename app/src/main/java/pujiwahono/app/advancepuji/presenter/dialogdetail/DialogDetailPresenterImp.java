package pujiwahono.app.advancepuji.presenter.dialogdetail;

import com.google.gson.Gson;

import okhttp3.Request;
import pujiwahono.app.advancepuji.models.dialogdetail.DialogDetailModel;
import pujiwahono.app.advancepuji.models.dialogdetail.DialogDetailModelImp;
import pujiwahono.app.advancepuji.utils.OkHttpTime;
import pujiwahono.app.advancepuji.utils.RxOkhttp;
import pujiwahono.app.advancepuji.view.fragment.DialogDetailView;
import rx.Observable;

/**
 * Created by evpuji2017 on 5/28/17.
 */

public class DialogDetailPresenterImp implements  DialogDetailPresenter {

    DialogDetailView view;
    DialogDetailModel model;

    public  DialogDetailPresenterImp (DialogDetailView view) {

        model = new DialogDetailModelImp();
        this.view = view;

    }


    @Override
    public Observable<DialogDetailModelImp> getResult(String id) {
        Request request = model.build(id);
        return RxOkhttp.streamStrings(OkHttpTime.client, request).map(s ->

            new Gson().fromJson(s, DialogDetailModelImp.class)
        );
    }
}
