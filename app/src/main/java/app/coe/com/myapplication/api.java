package app.coe.com.myapplication;

import app.coe.com.myapplication.model.Res;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface api {



    @GET("/")
    Call<Res> getData(@Query("amount") int amount , @Query("orderID") int orderID);
}
