package com.example.buttonapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScrollView scroll_layout = new ScrollView(this);
        LinearLayout linear_layout = new LinearLayout(this);

        linear_layout.setOrientation(LinearLayout.VERTICAL);
        linear_layout.setLayoutParams(new ViewGroup.LayoutParams(100, 100));


        scroll_layout.addView(linear_layout);

        for (int i = 0; i < 10; i++) {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, (float) i );

            Button myButton = new Button(this);
            myButton.setText(Integer.toString(i));
            //myButton.setText("click");
            myButton.setLayoutParams(params);
            linear_layout.addView(myButton);
        }

        //setContentView(R.layout.activity_main);
        setContentView(scroll_layout);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
