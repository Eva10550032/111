package com.example.arrayadapterspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner drink,temp;
    private TextView txv;
    private String[] tempSet1={"冰","溫","熱"};
    private String[] tempSet2={"冰","去冰"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv=(TextView)findViewById(R.id.order);
        temp=(Spinner)findViewById(R.id.temp);

        drink=(Spinner)findViewById(R.id.drink);
        drink.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItem(AdapterView<?> parent, View view, int position, long id) {
                String msg="飲料是"+drink.getSelectedItem().toString()+"\n";
                if(drink.getSelectedItem().toString().equals("紅茶") || drink.getSelectedItem().toString().equals("綠茶")){
                    ArrayAdapter<String> tempAdp=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item, tempSet1);
                    temp.setAdapter(tempAdp);
                }else{
                    ArrayAdapter<String> tempAdp=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item, tempSet2);
                    temp.setAdapter(tempAdp);
                }
                msg+="甜度是"+temp.getSelectedItem().toString();
                txv.setText(msg);
            }
        }
    }
}