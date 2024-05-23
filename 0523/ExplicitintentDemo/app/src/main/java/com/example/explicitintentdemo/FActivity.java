package com.example.explicitintentdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factivity);
        convertTempture();

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
    }

    private void convertTempture() {
        int c;
        double f=0.0;
        String place="";
        Bundle bundle = this.getIntent().getExtras();
        if(bundle != null) {
            c = bundle.getInt("TEMPC",0);
            f = (c * 9 / 5.0) + 32;
            place = bundle.getString("PLACE","");
            TextView Output = (TextView) findViewById(R.id.lblOutput);
            Output.setText(place+"華氏溫度：\n" + Double.toString(f));
        }
    }
}
