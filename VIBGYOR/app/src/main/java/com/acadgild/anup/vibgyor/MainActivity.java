package com.acadgild.anup.vibgyor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.duration;
import static com.acadgild.anup.vibgyor.R.id.activity_clickgreen;
import static com.acadgild.anup.vibgyor.R.id.text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button redbutn, orangebutn, yellowbutn, greenbutn, bluebutn, indigobutn, violetbutn;
    public String butncolor;
    private CharSequence txt;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();




    }

    private void init() {
        redbutn=(Button)findViewById(R.id.but1);
        orangebutn=(Button)findViewById(R.id.but2);
        yellowbutn=(Button)findViewById(R.id.but3);
        greenbutn=(Button)findViewById(R.id.but4);
        bluebutn=(Button)findViewById(R.id.but5);
        indigobutn=(Button)findViewById(R.id.but6);
        violetbutn=(Button)findViewById(R.id.but7);

        violetbutn.setTag("viloet button");
        indigobutn.setTag("indigo button");
        bluebutn.setTag("Blue button");
        greenbutn.setTag("Green button");
        yellowbutn.setTag("Yellow button");
        orangebutn.setTag("Orange button");
        redbutn.setTag("Red button");


        redbutn.setOnClickListener(this);
        orangebutn.setOnClickListener(this);
        yellowbutn.setOnClickListener(this);
        greenbutn.setOnClickListener(this);
        bluebutn.setOnClickListener(this);
        indigobutn.setOnClickListener(this);
        violetbutn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.but1:
                Intent intent1 = new Intent(MainActivity.this, red.class);
                startActivity(intent1);
                showToast(v);
                break;
            case R.id.but2:
                Intent intent2 = new Intent(MainActivity.this, orange.class);
                startActivity(intent2);
                showToast(v);
                break;
            case R.id.but3:
                Intent intent3 = new Intent(MainActivity.this, yellow.class);
                startActivity(intent3);
                showToast(v);
                break;
            case R.id.but4:
                Intent intent4 = new Intent(MainActivity.this, green.class);
                startActivity(intent4);
                showToast(v);
                break;
            case R.id.but5:
                Intent intent5 = new Intent(MainActivity.this, blue.class);
                startActivity(intent5);
                showToast(v);
                break;
            case R.id.but6:
                Intent intent6 = new Intent(MainActivity.this, indigo.class);
                startActivity(intent6);
                showToast(v);
                break;
            case R.id.but7:
                Intent intent7 = new Intent(MainActivity.this, violet.class);
                startActivity(intent7);
                showToast(v);
                break;
        }

    }
    public void showToast(View view){
        butncolor = view.getTag().toString();
        txt = butncolor+" was clicked";
        int duration = Toast.LENGTH_LONG;
        toast = Toast.makeText(getApplicationContext(), txt, duration);
        toast.show();
        Log.i("LOG: CLICKED : ",butncolor.toUpperCase());
    }
}
