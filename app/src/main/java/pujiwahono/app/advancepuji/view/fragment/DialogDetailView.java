package pujiwahono.app.advancepuji.view.fragment;

import pujiwahono.app.advancepuji.models.dialogdetail.DialogDetailModelImp;

/**
 * Created by evpuji2017 on 5/28/17.
 */

public interface DialogDetailView {
    void onSuccess(DialogDetailModelImp result);
    void onError(Throwable err);

}
