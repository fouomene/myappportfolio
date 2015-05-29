package com.fouomene.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // to display Icon launcher
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        // Get a reference to the button,
        ((Button)findViewById(R.id.buttonCat)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                printToast("you click button *The Cat*");

            }
        });

        // Get a reference to the button,
        ((Button)findViewById(R.id.buttonThing1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                printToast("you click button *Think 1*");

            }
        });

        // Get a reference to the button,
        ((Button)findViewById(R.id.buttonThing2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                printToast("you click button *Think 2*");

            }
        });

        // Get a reference to the button,
        ((Button)findViewById(R.id.buttonThingamajigger)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                printToast("you click button *Thingamajigger*");

            }
        });

        // Get a reference to the button,
        ((Button)findViewById(R.id.buttonSally)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                printToast("you click button *Sally*");

            }
        });


        // Get a reference to the button,
        ((Button)findViewById(R.id.buttonNick)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                printToast("you click button *Nick*");

            }
        });


        // Get a reference to the button,
        ((Button)findViewById(R.id.buttonSeuss)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                printToast("you click button *Seuss*");

            }
        });

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

    // print Toast text
    public void printToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
