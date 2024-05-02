package com.example.imageviewdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView image1, image2, image3, image4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        image1 = (ImageView) findViewById(R.id.imgOutput1);
        image2 = (ImageView) findViewById(R.id.imgOutput2);
        image3 = (ImageView) findViewById(R.id.imgOutput3);
        image4 = (ImageView) findViewById(R.id.imgOutput4);
        RadioGroup rg = (RadioGroup) findViewById(R.id.rgImages);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rdbDog){
                    image1.setVisibility(View.VISIBLE);
                    image2.setVisibility(View.GONE);
                    image3.setVisibility(View.GONE);
                    image4.setVisibility(View.GONE);
                }
                else if (checkedId == R.id.rdbElephant){
                    image1.setVisibility(View.GONE);
                    image2.setVisibility(View.VISIBLE);
                    image3.setVisibility(View.GONE);
                    image4.setVisibility(View.GONE);
                }
                else if(checkedId == R.id.rdbMouse){
                    image1.setVisibility(View.GONE);
                    image2.setVisibility(View.GONE);
                    image3.setVisibility(View.VISIBLE);
                    image4.setVisibility(View.GONE);
                }
                else if(checkedId == R.id.rdbRabbit){
                    image1.setVisibility(View.GONE);
                    image2.setVisibility(View.GONE);
                    image3.setVisibility(View.GONE);
                    image4.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
