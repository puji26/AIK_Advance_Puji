package pujiwahono.app.advancepuji.base;

/**
 * Created by evpuji2017 on 5/25/17.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import pujiwahono.app.advancepuji.models.MainModelImp;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;



public abstract class BaseActivity extends AppCompatActivity {

    protected Subscription subscriber = new CompositeSubscription();

    protected void bind(int layout) {
        setContentView(layout);
        ButterKnife.bind(this);
    }

    protected void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }



    @Override protected void onDestroy() {
        super.onDestroy();
        subscriber.unsubscribe();
    }
}
