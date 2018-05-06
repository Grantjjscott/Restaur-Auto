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

    public static Menu2 menu = new Menu2();
    static Boolean loaded = false;
    static Item item01 = new Item("Hot Dog", null, 99, 2.5);
    static Item item02= new Item("French Fries", null, 99, 2.50);
    static Item item03= new Item ("Soft Drink", null, 99, 1.00);
    static Item item04 =new Item ("Pizza", null, 99, 1.50);
    static Item  item05 = new Item("Bottled water", null , 99, 1.00);
    static Item item06 = new Item("ice cream",null, 99 , 1.25);
    static Item item07 = new Item ("Cheese Sticks", null, 99, 2.25);
    static Item item08 = new Item ("Hamburger", null, 99, 3.25);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (loaded == false) {// first time load menu
            menu.add(item01);
            menu.add(item02);
            menu.add(item03);
            menu.add(item04);
            menu.add(item05);
            menu.add(item06);
            menu.add(item07);
            menu.add(item08);
            loaded = true;
        }
    }


//to server view
    public void toServer(View view) {
        Intent serverView = new Intent(this, ServerActivity.class);
        startActivity(serverView);
    }

    ;

    public void sendMessage(View view) {



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


