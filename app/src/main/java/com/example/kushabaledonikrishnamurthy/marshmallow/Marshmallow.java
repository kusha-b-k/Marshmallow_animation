package com.example.kushabaledonikrishnamurthy.marshmallow;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RelativeLayout;

import java.util.Random;

public class Marshmallow extends AppCompatActivity {

    private Button marshmallow;
    private  RelativeLayout mrelativeLayout;
    private RelativeLayout mrelativelayout_inside;
    private TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marshmallow);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        marshmallow=(Button)findViewById(R.id.button);

        marshmallow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                marshmallow.setBackgroundColor(new Random().nextInt());
                marshmallow.setTextColor(new Random().nextInt());
                mrelativelayout_inside=(RelativeLayout)findViewById(R.id.rt2);
                mrelativelayout_inside.setHovered(true);
                mrelativelayout_inside.setBackgroundColor(new Random().nextInt());
               // Toast.makeText(getApplicationContext(), "MARSHMALLOW ANDROD 6.0", Toast.LENGTH_LONG).show();
                mrelativelayout_inside.setRotationY(new Random().nextInt());
                mrelativelayout_inside.setRotationX(new Random().nextInt());

        }
    });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_marshmallow, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
