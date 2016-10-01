package io.github.the28awg.okato.address;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by the28awg on 03.04.16.
 */
public interface AddressService {

    @GET("api.php?contentType=building")
    Call<AddressResponse> building(@Query("token") String token, @Query("cityId") String city, @Query("streetId") String street, @Query("query") String query);

    @GET("api.php?contentType=street")
    Call<AddressResponse> street(@Query("token") String token, @Query("cityId") String city, @Query("query") String query);

    @GET("api.php?contentType=city")
    Call<AddressResponse> city(@Query("token") String token, @Query("query") String query);
}
