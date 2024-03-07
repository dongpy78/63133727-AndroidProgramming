package com.example.ex5_addsubmuldiv_anynomous;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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
                performOperation('+');
            }
        });

        truButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performOperation('-');
            }
        });

        nhanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performOperation('*');
            }
        });

        chiaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performOperation('/');
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

    private void performOperation(char operation) {
        String firstText = firstEditText.getText().toString();
        String secondText = secondEditText.getText().toString();

        if (!firstText.isEmpty() && !secondText.isEmpty()) {
            double first = Double.parseDouble(firstText);
            double second = Double.parseDouble(secondText);
            double result = 0;

            switch (operation) {
                case '+':
                    result = first + second;
                    break;
                case '-':
                    result = first - second;
                    break;
                case '*':
                    result = first * second;
                    break;
                case '/':
                    if (second != 0) {
                        result = first / second;
                    } else {
                       // trường hợp chia cho số 0
                    }
                    break;
            }

            kqEditText.setText(String.valueOf(result));
            firstEditText.setText("");
            secondEditText.setText("");
        } else {
            Toast.makeText(this, "Bạn vui lòng nhập vào giá trị của 2 số!", Toast.LENGTH_SHORT).show();
        }
    }
}
