package com.mirea.krylovvv.lesson1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.textView6);
        TextView myTextView = (TextView) findViewById(R.id.textView6);
        myTextView.setText("New text in MIREA");
        Button button = findViewById(R.id.button18);
        button.setText("MireaButton");
        CheckBox checkBox = findViewById(R.id.checkBox2);
        checkBox.setChecked(true);
    }
}