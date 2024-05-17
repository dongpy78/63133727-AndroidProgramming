package com.buivandong.congtrunhanchia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText text_one;
    private EditText text_two;
    private EditText text_result;
    private Button cong_btn;
    private Button tru_btn;
    private Button nhan_btn;
    private Button chia_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        OnClickBtnCong();
        OnClickBtnTru();
        OnClickBtnNhan();
        OnClickBtnChia();
    }

    private void findViews() {
       text_one = findViewById(R.id.edit_text_one);
       text_two = findViewById(R.id.edit_text_two);
       text_result = findViewById(R.id.edit_text_result);
       cong_btn = findViewById(R.id.btn_cong);
       tru_btn = findViewById(R.id.btn_tru);
       nhan_btn = findViewById(R.id.btn_nhan);
       chia_btn = findViewById(R.id.btn_chia);
    }

    private void OnClickBtnCong() {
        cong_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyCong();
            }
        });
    }

    private void OnClickBtnTru() {
        tru_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyTru();
            }
        });
    }

    private void OnClickBtnNhan() {
        nhan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyNhan();
            }
        });
    }

    private void OnClickBtnChia() {
        chia_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyChia();
            }
        });
    }

    private void XuLyCong() {
        String number_one = text_one.getText().toString();
        String number_two = text_two.getText().toString();

        if(number_one.isEmpty() || number_two.isEmpty()) {
            showText("Vui lòng nhập giá trị để tính toán!");
            return;
        }


        double one = Double.parseDouble(number_one);
        double two = Double.parseDouble(number_two);
        double result = one + two;
        text_result.setText(String.valueOf(result));
        text_one.setText("");
        text_two.setText("");
    }

    private void XuLyTru() {
        String number_one = text_one.getText().toString();
        String number_two = text_two.getText().toString();

        if(number_one.isEmpty() || number_two.isEmpty()) {
            showText("Vui lòng nhập vào giá trị để tính toán!");
            return;
        }

        double one = Double.parseDouble(number_one);
        double two = Double.parseDouble(number_two);
        double result = one - two;
        text_result.setText(String.valueOf(result));

        text_one.setText("");
        text_two.setText("");
    }

    private void XuLyNhan() {
        String number_one = text_one.getText().toString();
        String number_two = text_two.getText().toString();

        if(number_one.isEmpty() || number_two.isEmpty()) {
            showText("Vui lòng nhập vào giá trị để tính toán!");
            return;
        }

        double one = Double.parseDouble(number_one);
        double two = Double.parseDouble(number_two);
        double result = one * two;
        text_result.setText(String.valueOf(result));

        text_one.setText("");
        text_two.setText("");
    }

    private void XuLyChia() {
        String number_one = text_one.getText().toString();
        String number_two = text_two.getText().toString();

        if(number_one.isEmpty() || number_two.isEmpty()) {
            showText("Vui lòng nhập vào giá trị để tính toán!");
            return;
        }

        double one = Double.parseDouble(number_one);
        double two = Double.parseDouble(number_two);
        double result = one / two;
        text_result.setText(String.valueOf(result));

        text_one.setText("");
        text_two.setText("");
    }

    private void showText(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}