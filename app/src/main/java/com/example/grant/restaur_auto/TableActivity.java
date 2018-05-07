package com.example.grant.restaur_auto;

import android.app.ActionBar;
import android.content.Intent;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import static java.security.AccessController.getContext;

public class TableActivity extends AppCompatActivity {
    private ArrayAdapter<Table> adapter;
    private String msg;
    private String seat;

    private int tablenum;
    private int numOfSeats ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        
        ListView listView = (ListView)findViewById(R.id.ListView);

//read tables to list
         adapter = new ArrayAdapter<Table>(this,android.R.layout.simple_expandable_list_item_1,MainActivity.tables);


        listView.setAdapter(adapter);
        
        
    }

 //table navigation

    
    //Opens up a dialog box where the User enters the number of seats at the new table

    public void addTable(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Add Table ");
        builder.setMessage("Enter Number of Seats");

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_NORMAL);
        builder.setView(input);

        builder.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                seat = input.getText().toString();

                tablenum = MainActivity.tableCount;
                numOfSeats = Integer.parseInt(seat);
                Table tab = new Table(tablenum, numOfSeats, 0);
                MainActivity.tables.add(tab);
                MainActivity.tableCount++;

                //refreshes the activity
                Intent i = getIntent();
                finish();
                startActivity(i);
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    
    //Method prompts a dialog box where the User enters the table number whose status will become "occupied"
    public void changeStatus(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Change Table Status");
        builder.setMessage("Enter Table Number");

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_NORMAL);
        builder.setView(input);

        builder.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                msg = input.getText().toString();
                int tableNum;
                tableNum = Integer.parseInt(msg);
                MainActivity.tables.get(tableNum - 1).setStatus(1);

                //refreshes the activity
                Intent i = getIntent();
                finish();
                startActivity(i);
            }
        });
        
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    
    }
