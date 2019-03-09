package com.example.jhetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void whenButtonClicked(View view) {
        // Do something here.
        TextView text_box = (TextView) findViewById(R.id.editText);
        text_box.setText("Hello");
    }
}
