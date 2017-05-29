package pujiwahono.app.advancepuji.utils;

import pujiwahono.app.advancepujilistlaptop.BuildConfig;

public class URLs {
    private static final String BASE_URL = BuildConfig.URI;
    private  static final String DETAIL_URL = "/getLaptop.php?id=";


    public static String getMainURL() {
        return BASE_URL ;
    }

    public static String getDetailURL(String id) {
        return BASE_URL + DETAIL_URL + id;
    }
}
