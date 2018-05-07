package com.example.grant.restaur_auto;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import android.*;


import java.util.ArrayList;

import static android.widget.Toast.LENGTH_SHORT;

public class ServerActivity extends AppCompatActivity {
    private ArrayAdapter<String> adapter;
    ArrayList<String> items;
    int i;
    int itemid;
    static ArrayList<Item> temp;
    static AdapterView clicker;
    Toast toast;
    String onAdd;
    Context context;

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

    public void additems(View view) {
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
        temp = new ArrayList<>();
        i = 0;
        while (i < MainActivity.menu.size()) {
            items.add(MainActivity.menu.get(i).toString());
            i++;

        }

        // write menu
        itemid = 0;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, items);
        listView.setAdapter(adapter);

        listView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 itemid = i;
                temp.add((Item) MainActivity.menu.get(itemid));
                onAdd = "item selected";
                toast.makeText(listView.getContext() , onAdd, Toast.LENGTH_SHORT).show();
            }});}}

            // listView.setOnClickListener(AdapterView.OnClickListener();)
