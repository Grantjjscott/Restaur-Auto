package com.example.grant.restaur_auto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CookActivity extends AppCompatActivity {
    private ArrayList<String> orderStrings;
private ArrayAdapter<String> adapter;
private int i;


=======

public class CookActivity extends AppCompatActivity {
>>>>>>> d497fc46d9b4effca65bdcae52d12ebe712bd6b5

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cook);
<<<<<<< HEAD
        // get list view
        ListView listView = (ListView) findViewById(R.id.orderview  );
        // menu to string
        orderStrings= new ArrayList<String>();
        i= 0;
        while (i< MainActivity.orders.size()) {
            orderStrings.add(MainActivity.orders.get(i).toString());
            i++;

        }
        // write menu
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, orderStrings);
        listView.setAdapter(adapter);
=======
>>>>>>> d497fc46d9b4effca65bdcae52d12ebe712bd6b5
    }
    public void SetServed(){

    }
}
