package com.myappsworld.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener{


    Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {

        if(v == b1){
            Toast.makeText(getApplicationContext(), "This button will launch Spotify Streamer App. ", Toast.LENGTH_LONG).show();
        }else if(v == b2){
            Toast.makeText(getApplicationContext(),"This button will launch Football Scores App. ",Toast.LENGTH_LONG).show();
        }else if(v == b3){
            Toast.makeText(getApplicationContext(),"This button will launch Library App. ",Toast.LENGTH_LONG).show();
        }else if(v == b4){
            Toast.makeText(getApplicationContext(),"This button will launch Build It Bigger App. ",Toast.LENGTH_LONG).show();
        }else if(v == b5){
            Toast.makeText(getApplicationContext(),"This button will launch XYZ Reader App. ",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"This button will launch Capstone App.",Toast.LENGTH_LONG).show();
        }

    }
}
