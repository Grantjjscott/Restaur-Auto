package com.example.grant.restaur_auto;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import static java.security.AccessController.getContext;

public class TableActivity extends AppCompatActivity {
    private ArrayAdapter<Table> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        ListView listView = (ListView)findViewById(R.id.ListView);
         adapter = new ArrayAdapter<Table>(this,android.R.layout.simple_expandable_list_item_1,MainActivity.tables);

        listView.setAdapter(adapter);
    }

    public void addTable(View view){
        Intent newTable = new Intent(this, CreateTableActivity.class);
        startActivity(newTable);
    }


    }
