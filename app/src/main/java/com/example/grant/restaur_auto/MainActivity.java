package com.example.grant.restaur_auto;
        import android.content.Intent;
        import android.*;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;

        import java.util.ArrayList;
        import java.util.LinkedList;

        import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    static int orderCount = 1;
    static int tableCount = 1;
    static Server server01 = new Server(01, "Nate", 7.25);
    public static ArrayList<Table> tables = new ArrayList<Table>();
    public static ArrayList<Order> orders = new ArrayList<Order>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ;

    public void sendMessage(View view) {

        Intent serverView = new Intent(this, ServerActivity.class);
        startActivity(serverView);
    }

    public void toCook(View view) {
        Intent cookView = new Intent(this, CookActivity.class);
        startActivity(cookView);
    }

    public void toTable(View view){
    Intent tableview = new Intent( this, TableActivity.class);
    startActivity(tableview);
    }
}


