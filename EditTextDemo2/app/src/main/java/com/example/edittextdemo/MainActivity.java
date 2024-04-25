package com.example.edittextdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button_Click(View view){
        EditText edtName=(EditText) findViewById(R.id.edtName);
        TextView txvShow=txvShow=(TextView) findViewById(R.id.txvShow);
        String name=edtName.getText().toString();
        txvShow.setText("你的名字:"+name);
    }
}