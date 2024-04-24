package com.buivandong.intentvidu2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class ManHinhQuiz2 extends AppCompatActivity {
    private RadioButton option1_1, option1_2, option1_3, option1_4;
    private RadioButton option2_1, option2_2, option2_3, option2_4;
    Button btn_submit_1;
    Button btn_submit_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_quiz2);
        findViews();
        check_answer_question_1();
        check_answer_question_2();
    }

    private void findViews() {
        option1_1 = findViewById(R.id.radio_option1_1);
        option1_2 = findViewById(R.id.radio_option1_2);
        option1_3 = findViewById(R.id.radio_option1_3);
        option1_4 = findViewById(R.id.radio_option1_4);
        btn_submit_1 = findViewById(R.id.btn_submit_1);

        option2_1 = findViewById(R.id.radio_option2_1);
        option2_2 = findViewById(R.id.radio_option2_2);
        option2_3 = findViewById(R.id.radio_option2_3);
        option2_4 = findViewById(R.id.radio_option2_4);

        btn_submit_2 = findViewById(R.id.btn_submit_2);


    }

    private void check_answer_question_1() {
        btn_submit_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(option1_1.isChecked()) {
                    showToast("Wrong Answer!");
                } else if(option1_2.isChecked()) {
                    showToast("Wrong Answer!");
                } else if(option1_3.isChecked()) {
                    showToast("Wrong Answer!");
                } else if(option1_4.isChecked()) {
                    showToast("Correct Answer!");
                } else {
                    showToast("Vui lòng chọn 1 đáp án!");
                }

            }
        });
    }

    private void check_answer_question_2() {
        btn_submit_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(option2_1.isChecked()) {
                    showToast("Wrong Answer!");

                } else if(option2_2.isChecked()) {
                    showToast("Wrong Answer!");
                } else if(option2_3.isChecked()) {
                    showToast("Correct Answer! ");

                } else if(option2_4.isChecked()) {
                    showToast("Wrong Answer!");
                } else {
                    showToast("Vui lòng chọn 1 đáp án!");
                }

            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}