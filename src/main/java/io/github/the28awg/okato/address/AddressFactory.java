package io.github.the28awg.okato.address;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by the28awg on 03.04.16.
 */
public class AddressFactory {

    private static String TOKEN = "";
    private static final String ENDPOINT = "http://kladr-api.ru/";

    public static String token() {
        return TOKEN;
    }

    public static void token(String token) {
        AddressFactory.TOKEN = token;
    }

    public static AddressService service() {
        return Helper.SERVICE;
    }

    private static class Helper {
        private static final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        private static final AddressService SERVICE = retrofit.create(AddressService.class);
    }
}
