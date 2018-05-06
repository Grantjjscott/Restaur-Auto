package com.example.grant.restaur_auto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ViewFlipper;
import android.*;

import java.util.ArrayList;

public class ServerActivity extends AppCompatActivity {
    private ArrayAdapter<String> adapter;
    ArrayList<String> items;
    int i;
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
        // get list view
        ListView listView = (ListView) findViewById(R.id.listitem);
        // menu to string
        items = new ArrayList<>();
        i= 0;
        while (i< MainActivity.menu.size()) {
            items.add(MainActivity.menu.get(i).toString());
            i++;

        }
        // write menu
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, items);
        listView.setAdapter(adapter);

    }
    //TODO onclick listener for all buttons


}
