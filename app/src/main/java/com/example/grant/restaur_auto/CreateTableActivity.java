package com.example.grant.restaur_auto;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CreateTableActivity extends AppCompatActivity {
  private  EditText UserIn;
  private int tablenum;
  private int numOfSeats ;
  private CharSequence onCreate;
  private Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_table);
        UserIn=(EditText) findViewById(R.id.userIn);
}


        public void NewTable (View view){
            tablenum = MainActivity.tableCount;
            numOfSeats = Integer.parseInt(String.valueOf(UserIn.getText()));
            Table tab = new Table(tablenum, numOfSeats);
            MainActivity.tables.add(tab);
            MainActivity.tableCount++;
            onCreate = "Table Added";
            toast.makeText(this, onCreate, Toast.LENGTH_SHORT).show();

        }
}
