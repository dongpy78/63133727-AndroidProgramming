package com.example.ex4_addsubmuldiv_onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText firstEditText;
    private EditText secondEditText;
    private Button congButton;
    private Button truButton;
    private Button nhanButton;
    private Button chiaButton;

    private EditText kqEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        setupButtonClickListener();

    }

    private void setupButtonClickListener() {
        congButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cong(view);
            }
        });

        truButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tru(view);
            }
        });

        nhanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Nhan(view);
            }
        });

        chiaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Chia(view);
            }
        });
    }


    private void findView() {
        firstEditText = findViewById(R.id.edit_text_fist);
        secondEditText = findViewById(R.id.edit_text_second);
        congButton = findViewById(R.id.button_cong);
        truButton = findViewById(R.id.button_tru);
        nhanButton = findViewById(R.id.button_nhan);
        chiaButton = findViewById(R.id.button_chia);
        kqEditText = findViewById(R.id.edit_text_kq);
    }

    private void Cong(View view) {
        String firstText = firstEditText.getText().toString();
        String secondText = secondEditText.getText().toString();
        Double first = Double.parseDouble(firstText);
        Double second = Double.parseDouble(secondText);
        double tong = first + second;
        kqEditText.setText(String.valueOf(tong));

        firstEditText.setText("");
        secondEditText.setText("");
    }

    private void Tru(View view) {
        String firstText = firstEditText.getText().toString();
        String secondText = secondEditText.getText().toString();
        Double first = Double.parseDouble(firstText);
        Double second = Double.parseDouble(secondText);
        double tong = first - second;
        kqEditText.setText(String.valueOf(tong));

        firstEditText.setText("");
        secondEditText.setText("");
    }

    private void Nhan(View view) {
        String firstText = firstEditText.getText().toString();
        String secondText = secondEditText.getText().toString();
        Double first = Double.parseDouble(firstText);
        Double second = Double.parseDouble(secondText);
        double tong = first * second;
        kqEditText.setText(String.valueOf(tong));

        firstEditText.setText("");
        secondEditText.setText("");
    }

    private void Chia(View view) {
        String firstText = firstEditText.getText().toString();
        String secondText = secondEditText.getText().toString();
        Double first = Double.parseDouble(firstText);
        Double second = Double.parseDouble(secondText);
        double tong = first / second;
        kqEditText.setText(String.valueOf(tong));

        firstEditText.setText("");
        secondEditText.setText("");
    }
}