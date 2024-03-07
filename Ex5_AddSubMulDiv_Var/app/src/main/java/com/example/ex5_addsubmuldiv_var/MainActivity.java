package com.example.ex5_addsubmuldiv_var;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
        congButton.setOnClickListener(new MyClickListener());
        truButton.setOnClickListener(new MyClickListener());
        nhanButton.setOnClickListener(new MyClickListener());
        chiaButton.setOnClickListener(new MyClickListener());
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

    private class MyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            try {
                if (view.getId() == R.id.button_cong) {
                    Cong();
                } else if (view.getId() == R.id.button_tru) {
                    Tru();
                } else if (view.getId() == R.id.button_nhan) {
                    Nhan();
                } else if (view.getId() == R.id.button_chia) {
                    Chia();
                }
            } catch (NumberFormatException e) {
                // Handle the case when the input is not a valid number
                kqEditText.setText("Invalid input");
            }
        }
    }


    private void Cong() {
        String firstText = firstEditText.getText().toString();
        String secondText = secondEditText.getText().toString();
        Double first = Double.parseDouble(firstText);
        Double second = Double.parseDouble(secondText);
        double tong = first + second;
        kqEditText.setText(String.valueOf(tong));

        firstEditText.setText("");
        secondEditText.setText("");
    }

    private void Tru() {
        String firstText = firstEditText.getText().toString();
        String secondText = secondEditText.getText().toString();
        Double first = Double.parseDouble(firstText);
        Double second = Double.parseDouble(secondText);
        double hieu = first - second;
        kqEditText.setText(String.valueOf(hieu));

        firstEditText.setText("");
        secondEditText.setText("");
    }

    private void Nhan() {
        String firstText = firstEditText.getText().toString();
        String secondText = secondEditText.getText().toString();
        Double first = Double.parseDouble(firstText);
        Double second = Double.parseDouble(secondText);
        double tich = first * second;
        kqEditText.setText(String.valueOf(tich));

        firstEditText.setText("");
        secondEditText.setText("");
    }

    private void Chia() {
        String firstText = firstEditText.getText().toString();
        String secondText = secondEditText.getText().toString();
        Double first = Double.parseDouble(firstText);
        Double second = Double.parseDouble(secondText);

        // Handle division by zero
        if (second != 0) {
            double thuong = first / second;
            kqEditText.setText(String.valueOf(thuong));
        } else {
            kqEditText.setText("Không thể chia cho 0");
        }

        firstEditText.setText("");
        secondEditText.setText("");
    }
}
