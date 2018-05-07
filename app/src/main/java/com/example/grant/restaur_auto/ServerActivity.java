package com.example.grant.restaur_auto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
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
    int itemid;
    static ArrayList<Item> temp;
    static AdapterView clicker;


    ListView listView;
    public void newOrder(View view){
    Intent order = new Intent(this, NewOrderActivity.class);
    startActivity(order);
    }

    public void printRepceit(View view){
    Intent repceit = new Intent(this, Pop.class);
        startActivity(repceit);

    //order.generateReceipt();
    }

    public void additems() {
    Intent addtoOrder = new Intent(this, AddtoOrder.class);
    startActivity(addtoOrder);
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
        listView = (ListView) findViewById(R.id.itemlist);
        // menu to string
        items = new ArrayList<>();
        temp =new ArrayList<>();
        i = 0;
        while (i < MainActivity.menu.size()) {
            items.add(MainActivity.menu.get(i).toString());
            i++;

        }

        // write menu
        itemid=0;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, items);
        listView.setAdapter(adapter);
        AdapterView.OnItemClickListener mMessageClickedHandler = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                itemid =position;
            }
        };

        listView.setOnItemClickListener(mMessageClickedHandler);
                    mMessageClickedHandler.onItemClick(additems());








        //itemid = listView.getSelectedItemPosition();
        //temp.add((Item) MainActivity.menu.get(itemid));




        }
    }
