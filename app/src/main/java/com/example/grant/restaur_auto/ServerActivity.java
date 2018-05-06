package com.example.grant.restaur_auto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;
import android.*;

public class ServerActivity extends AppCompatActivity {

    public void newOrder(View view){
    Intent order = new Intent(this, NewOrderActivity.class);
    startActivity(order);
    }

    public void printRepceit(View view){
    Intent repceit = new Intent(this, Pop.class);
        startActivity(repceit);
    //order.generateReceipt();
    }

    public void additems(View view){
     MainActivity.server01.addToOrder(null,null, 0);
    }

    public void setServed(View view){
        MainActivity.server01.setOrdertoServe(null);
    }

    public void markpaid(View view){
        MainActivity.server01.setOrdertoPaid(null);
    }
    public ServerActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server);
    }

}
