package pujiwahono.app.advancepuji.models.dialogdetail;

import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import okhttp3.Request;
import pujiwahono.app.advancepuji.utils.URLs;
import pujiwahono.app.advancepujilistlaptop.R;

/**
 * Created by evpuji2017 on 5/28/17.
 */

public class DialogDetailModelImp implements DialogDetailModel {
    private Data data;


    public Data getData() {
        return data;
    }


    public void setData(Data data) {
        this.data = data;
    }




    public static class  Data {
        private String modelname;
        private String ram;
        private String os;
        private String price;
        private String screensize;
        private String brand;


        public String getModelname() {
            return modelname;
        }

        public void setModelName(String modelname) {
            this.modelname = modelname;
        }


        public String getRam() {
            return ram;
        }

        public void setRam(String ram) {
            this.ram = ram;
        }

        public String getOs() {
            return os;
        }

        public void setOs(String os) {
            this.os = os;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getScreensize() {
            return screensize;
        }

        public void setScreensize(String screensize) {
            this.screensize = screensize;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }
    }



    @Override public Request build(String id) {
        return new Request.Builder()
                .get()
                .url(URLs.getDetailURL(id))
                .build();

    }

}
