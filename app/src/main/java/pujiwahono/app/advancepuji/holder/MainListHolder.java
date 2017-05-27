package pujiwahono.app.advancepuji.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import pujiwahono.app.advancepujilistlaptop.R;

/**
 * Created by evpuji2017 on 5/25/17.
 */

public class MainListHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.item_lislaptop) LinearLayout itemLisLaptop;
    @BindView(R.id.txtName) TextView txtName;
    @BindView(R.id.txtViewRam) TextView txtRam;
    @BindView(R.id.txtViewOS) TextView txtOS;
    @BindView(R.id.txtViewPrice) TextView txtPrice;
    @BindView(R.id.txtViewScreensize) TextView txtScreenSize;
    @BindView(R.id.txtViewBrand) TextView txtBrand;
    public MainListHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);

    }

    public LinearLayout getItemLisLaptop() {
        return itemLisLaptop;
    }

    public void bind(String modelname ) {
        txtName.setText(modelname);
    }
    public void bRam( String ram ) {
        txtRam.setText(ram);

    }

    public void bOS( String os ) {
        txtOS.setText(os);

    }

    public void bPrice( String price ) {
        txtPrice.setText(price);

    }

    public void bScreensize( String screensize ) {
        txtScreenSize.setText(screensize);

    }

    public void bBrand( String brand ) {
        txtBrand.setText(brand);

    }





//    public void mRam(String Ram ) {
//        txtRam.setText(Ram);
//
//    }


}
