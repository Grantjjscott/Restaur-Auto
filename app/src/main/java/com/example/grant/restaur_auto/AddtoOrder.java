package com.example.grant.restaur_auto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.grant.restaur_auto.ServerActivity.temp;

public class AddtoOrder extends AppCompatActivity {
    private ArrayList<String> orderStrings;
    private ArrayAdapter<String> adapter;
    private ListView listView;
    private int i;
    private int orderid;
    private int size;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addto_order);


            // get list view
             listView = (ListView) findViewById(R.id.listorders);
            // menu to string
            orderStrings = new ArrayList<String>();
            i = 0;
            size= temp.size();
            while (i < MainActivity.orders.size()) {
                orderStrings.add(MainActivity.orders.get(i).toString());
                i++;

            }
            // write menu
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, orderStrings);
            listView.setAdapter(adapter);
            i=0;
            orderid = listView.getSelectedItemPosition();
            while (i<= size) {
                MainActivity.server01.addToOrder(MainActivity.orders.get(orderid), temp.get(i), 1);
            i++;
            }
            temp.clear();


    }
}
