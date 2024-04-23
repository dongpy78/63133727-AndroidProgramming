package com.buivandong.intentvidu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ManHinhChinh extends AppCompatActivity {
    Button btn_quiz1;
    Button btn_quiz2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chinh);

        Intent thuNhanduoc = getIntent();
        String ten = thuNhanduoc.getStringExtra("welcome");
        TextView chao_mung = findViewById(R.id.name_welcome);
        chao_mung.setText(ten);

        btn_quiz1 = findViewById(R.id.btn_quiz_1);
        btn_quiz2 = findViewById(R.id.btn_quiz_2);

        btn_quiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chuyenManHinh1();
            }
        });

        btn_quiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chuyenManHinh2();
            }
        });
    }
    public void chuyenManHinh1() {
        Intent intent = new Intent(ManHinhChinh.this, ManHinhQuiz1.class);
        startActivity(intent);
    }

    public void chuyenManHinh2() {
        Intent intent = new Intent(ManHinhChinh.this, ManHinhQuiz2.class);
        startActivity(intent);
    }
}