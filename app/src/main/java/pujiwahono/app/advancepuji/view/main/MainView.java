package pujiwahono.app.advancepuji.view.main;

import pujiwahono.app.advancepuji.models.MainModelImp;

/**
 * Created by evpuji2017 on 5/25/17.
 */

public interface MainView {
    void onSuccess(MainModelImp result);
    void onError(Throwable err);


}


