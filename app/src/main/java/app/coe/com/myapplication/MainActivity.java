package app.coe.com.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import app.coe.com.myapplication.model.Res;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button linePay = (Button) findViewById(R.id.linePay);
        final TextView  txtOrderID= (TextView) findViewById(R.id.txtOrderID);
        final EditText txtAmount= (EditText) findViewById(R.id.txtAmount);


        final int orderId  = (int)(Math.random() * 99999999 + 1);
        txtOrderID.setText("Order Id : " +  orderId+"");

        linePay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gson gson = new GsonBuilder() .setLenient() .create();
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("http://128.199.225.90:3000")
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .build();

                api feedData = retrofit.create(api.class);





                int amout = Integer.parseInt(txtAmount.getText().toString());
                feedData.getData(amout , orderId).enqueue(new Callback<Res>() {
                    @Override
                    public void onResponse(Call<Res> call, Response<Res> response) {


                        if(response.code() == 200){


                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(response.body().getInfo().getPaymentUrl().getWeb()));
                            startActivity(browserIntent);

                        }
                    }

                    @Override
                    public void onFailure(Call<Res> call, Throwable t) {
                        Log.i("TAG ERROR" ,  t.getMessage());
                    }
                });
            }
        });




    }
}
