package pujiwahono.app.advancepuji.presenter.dialogdetail;

import pujiwahono.app.advancepuji.models.dialogdetail.DialogDetailModelImp;
import rx.Observable;

/**
 * Created by evpuji2017 on 5/28/17.
 */

public interface DialogDetailPresenter {
    Observable<DialogDetailModelImp> getResult (String id);


}
