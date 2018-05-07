package com.example.grant.restaur_auto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.grant.restaur_auto.ServerActivity.temp;

public class AddtoOrder extends AppCompatActivity {
    private ArrayList<String> orderStrings;
    private ArrayAdapter<String> adapter;
    private ListView listView;
    private int i;
    private int orderid;
    private int size;
    private String added;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addto_order);
        added= "Items Added";

        // get list view
        final ListView listView = (ListView) findViewById(R.id.listorders);
        // menu to string
        orderStrings = new ArrayList<String>();
        i = 0;
        while (i < MainActivity.orders.size()) {
            orderStrings.add(MainActivity.orders.get(i).toString());
            i++;

        }
        // write menu
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, orderStrings);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int j= 0;
                while (j<ServerActivity.temp.size()) {
                    MainActivity.server01.addToOrder(MainActivity.orders.get(i), ServerActivity.temp.get(j),1);
                    j++;
                }
                ServerActivity.temp.clear();
                toast.makeText(listView.getContext() , added, Toast.LENGTH_SHORT).show();
            }


    });
}
}
