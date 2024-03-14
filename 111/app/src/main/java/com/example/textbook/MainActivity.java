package com.example.textbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button(View view){
        EditText edtName =(EditText) findViewById(R.id.edtName);
        TextView textShow =textShow= (TextView) findViewById(R.id.textShow);
        String name = edtName.getText().toString();
        textShow.setText("你的名字是:"+name);
    }
}