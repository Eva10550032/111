package com.example.ticket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int ADULT_TICKET_PRICE = 400;
    private static final int CHILD_TICKET_PRICE = 250;
    private static final int STUDENT_TICKET_PRICE = 400;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_Click(View view) {
        RadioButton boy = findViewById(R.id.rdbBoy);
        RadioButton girl = findViewById(R.id.rdbGirl);
        String gender = "";
        if (boy.isChecked())
            gender = "男生";
        else if (girl.isChecked())
            gender = "女生";

        RadioGroup type = findViewById(R.id.rgType);
        String ticketType = "";
        int selectedTypeId = type.getCheckedRadioButtonId();
        if (selectedTypeId == R.id.rdbAdult)
            ticketType = "全票";
        else if (selectedTypeId == R.id.rdbChild)
            ticketType = "兒童票";
        else if (selectedTypeId == R.id.rdbStudent)
            ticketType = "學生票";

        Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
        intent.putExtra("gender", gender);
        intent.putExtra("ticketType", ticketType);
        boolean ticketCount=false;
        intent.putExtra("ticketCount", ticketCount);
        boolean totalPrice=false;
        intent.putExtra("totalPrice", totalPrice);
        startActivity(intent);



    }


}







