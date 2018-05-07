package com.example.grant.restaur_auto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NewOrderActivity extends AppCompatActivity {

    private  int orderNum;
    private  int tableNum;
    private EditText userIn;
    private CharSequence onCreate;
    private Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);
        userIn = (EditText)findViewById(R.id.userIn);
    }


    public void Submit(View view){
        tableNum = Integer.parseInt(String.valueOf(userIn.getText()));
        tableNum--;
        orderNum = MainActivity.orderCount;
        Order order = new Order(orderNum, MainActivity.tables.get(tableNum));
        MainActivity.orders.add(order);
        MainActivity.orderCount++;
        onCreate = "Order Added";
        toast.makeText(this, onCreate, Toast.LENGTH_SHORT).show();
    }

}
