package pujiwahono.app.advancepuji.models.main;


import java.util.ArrayList;

import okhttp3.Request;
import pujiwahono.app.advancepuji.utils.URLs;

/**
 * Created by evpuji2017 on 5/25/17.
 */

public class MainModelImp  implements MainModel {

    private ArrayList<Data> data;

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    public class Data {
        private int id;
        private String modelname;
        private String ram;
        private String os;
        private String price;
        private String screensize;
        private String brand;


        public int getId() {
            return id;
        }

        public String getModelname() {
            return modelname;
        }

                public String getRam() {
            return ram;
        }

        public String getOs() {
            return os;
        }

        public String getPrice() {
            return price;
        }

        public String getScreensize() {
            return screensize;
        }

        public String getBrand() {
            return brand;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setModelname(String modelname) {
            this.modelname = modelname;
        }

                public void setRam(String ram) {
            this.ram = ram;
        }

        public void setOs(String os) {
            this.os = os;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public void setScreensize(String screensize) {
            this.screensize = screensize;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }


    }

    @Override
    public Request build() {
        return new Request.Builder()
                .get()
                .url(URLs.getMainURL())
                .build();

    }

}
