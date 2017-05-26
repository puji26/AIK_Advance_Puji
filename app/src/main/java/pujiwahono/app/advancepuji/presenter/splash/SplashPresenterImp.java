package pujiwahono.app.advancepuji.presenter.splash;

import android.os.Handler;

import pujiwahono.app.advancepuji.view.splash.SplashView;

/**
 * Created by evpuji2017 on 5/26/17.
 */

public class SplashPresenterImp implements SplashPresenter {

    SplashView view;

    public SplashPresenterImp(SplashView view) {
        this.view = view;
    }

    @Override public void waitSplash(int duration) {
       new Handler().postDelayed(() -> {
           view.showAlert();
           view.openMain();

       }, duration);

    }
}
