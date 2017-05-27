package pujiwahono.app.advancepuji.view.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pujiwahono.app.advancepuji.base.BaseActivity;
import pujiwahono.app.advancepuji.presenter.splash.SplashPresenter;
import pujiwahono.app.advancepuji.presenter.splash.SplashPresenterImp;
import pujiwahono.app.advancepuji.view.main.MainActivity;
import pujiwahono.app.advancepujilistlaptop.R;

public class SplashActivity extends BaseActivity implements SplashView  {

    SplashPresenter splashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind(R.layout.activity_splash);

        splashPresenter = new SplashPresenterImp(this);
        splashPresenter.waitSplash(5000);
    }

    @Override
    public void showAlert() {
        showToast("Selamat Datang di Toko Laptop Online");
    }

    @Override
    public void openMain() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
