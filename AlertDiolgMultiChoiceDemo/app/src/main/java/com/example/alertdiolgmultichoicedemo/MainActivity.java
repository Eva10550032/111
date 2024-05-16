package com.example.alertdiolgmultichoicedemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.system.StructMsghdr;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
implements DialogInterface.OnClickListener{

    private String[] items = {"選項1", "選項2", "選項3"};
    private boolean[] itemsChecked = new boolean[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSelect =(Button) findViewById(R.id.btnSelect);
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog build=new AlertDialog.Builder(MainActivity.this)
                        .setTitle("請勾選項")
                        .setPositiveButton("確定",null)
                        .setNegativeButton("取消",null)
                        .setMultiChoiceItems(items, itemsChecked,null)
                        .show();
            }
        });
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        String msg="";
        switch (which){
            case DialogInterface.BUTTON_POSITIVE:
                String result = "你選擇了:";
                for (int index= 0; index< items.length; index++) {
                    if (itemsChecked[index]) {
                        result += items[index] + "\n";
                    }
                    TextView output = findViewById(R.id.lblOutput);
                    output.setText(msg);
                    break;
                    case DialogInterface.BUTTON_NEGATIVE:
                        Toast.makeText(this, "取消", Toast.LENGTH_SHORT).show();
                        break;



        }
    }
}