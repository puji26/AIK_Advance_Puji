package pujiwahono.app.advancepuji.presenter.main;

import pujiwahono.app.advancepuji.models.MainModelImp;
import rx.Observable;

/**
 * Created by evpuji2017 on 5/26/17.
 */

public interface MainPresenter {
    Observable<MainModelImp> getResult();
}
