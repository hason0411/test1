package com.example.android.test;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.android.test.entity.Cuisine;

public class MyListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_my_list);
        this.setTitle("Menu");

        Cuisine[] cuisines = new Cuisine[3];
        cuisines[0] = new Cuisine(4.1f,"chicken rice",3.3,"chicken_rice");
        cuisines[1] = new Cuisine(3.5f,"nasi lemak",4.0,"nasi_lemak");
        cuisines[2] = new Cuisine(2.5f,"fish bee hoon",4.5,"fish_beehoon");
        CuisineAdapter adapter = new CuisineAdapter(cuisines,this);
        setListAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_list, menu);
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
