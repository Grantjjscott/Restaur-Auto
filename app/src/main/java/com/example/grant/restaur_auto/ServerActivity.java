package com.example.grant.restaur_auto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;
import android.content.*;


public class ServerActivity extends AppCompatActivity {

    public void newOrder(View view){
    MainActivity.server01.newOrder(01, null);
    }

    public void printRepceit(View view){
        Intent i = new Intent( this, Pop.class) ;
        startActivityForResult(i, 0);

        //order.generateReceipt();
    }

    public void additems(View view)
    {
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
        Button addButton = (Button) findViewById(R.id.ad);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Pop.class));
    }

}
