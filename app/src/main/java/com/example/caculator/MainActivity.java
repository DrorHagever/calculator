package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_add, btn_sub, btn_mult, btn_div;
    EditText editTextN1, editTextN2;
    TextView textViewAnswer;
    int num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //קישור בין משתנה מסוג כפתור לכפתור בxml
        btn_add = findViewById(R.id.button_add);
        btn_sub = findViewById(R.id.button_sub);
        btn_mult = findViewById(R.id.button_mult);
        btn_div = findViewById(R.id.button_div);
        // עוד קישורים:
        editTextN1 = findViewById(R.id.number1);
        editTextN2 = findViewById(R.id.number2);


        textViewAnswer = findViewById(R.id.answer);

        // מאזינים לכל הכפתורים
        btn_add.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_mult.setOnClickListener(this);
        btn_div.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (editTextN1.getText().toString().equals("") || editTextN2.getText().toString().equals("")){
            Toast.makeText(this, "enter numbers", Toast.LENGTH_SHORT).show();
            return;
        }

        num1 = Integer.parseInt(editTextN1.getText().toString());
        num2 = Integer.parseInt(editTextN2.getText().toString());


        if (v.getId() == R.id.button_add)
            textViewAnswer.setText(String.valueOf(num1+num2));
        if (v.getId() == R.id.button_sub)
            textViewAnswer.setText(String.valueOf(num1-num2));
        if (v.getId() == R.id.button_mult)
            textViewAnswer.setText(String.valueOf(num1*num2));
        if (v.getId() == R.id.button_div)
            textViewAnswer.setText(String.valueOf((float) num1/(float) num2));

    }
}