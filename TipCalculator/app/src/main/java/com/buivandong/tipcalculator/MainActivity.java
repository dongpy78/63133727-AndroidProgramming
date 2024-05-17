package com.buivandong.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.number.NumberRangeFormatter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText text_input;
    private RadioButton radio_button_13;
    private RadioButton radioButton_15;
    private RadioButton radioButton_18;
    private Button btn_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        OnClickCalculator();
    }

    private void findViews() {
        text_input = findViewById(R.id.edit_text_input);
        radio_button_13 = findViewById(R.id.radio_button_13);
        radioButton_15 = findViewById(R.id.radio_button_15);
        radioButton_18 = findViewById(R.id.radio_button_18);
        btn_result = findViewById(R.id.btn_calculator);
    }

    private void OnClickCalculator() {
        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xu_ly();
            }
        });
    }

    private void xu_ly() {
        String get_input_string = text_input.getText().toString();

        if(get_input_string.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập vào số tiền!", Toast.LENGTH_SHORT).show();
            return;
        }

        double inputAmount = Double.parseDouble(get_input_string);

        double tipPercent = 0;
        if(radio_button_13.isChecked()) {
            tipPercent = 13;
        } else if(radioButton_15.isChecked()) {
            tipPercent = 15;
        } else if(radioButton_18.isChecked()) {
            tipPercent = 18;
        }

        // Tính tiền tips
        double tien_Tips = (inputAmount * tipPercent) / 100;
        Toast.makeText(MainActivity.this, "Your tips will be: " + tien_Tips, Toast.LENGTH_SHORT).show();
    }

}