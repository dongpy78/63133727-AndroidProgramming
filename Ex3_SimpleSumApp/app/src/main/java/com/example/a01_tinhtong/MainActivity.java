package com.example.a01_tinhtong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Bộ lắng nghe và xử lý sự kiện
    public void XuLyCong(View view) {
        // Tìm, tham chiếu đến điều khiển trên XML
        EditText editTextA = findViewById(R.id.edtA);
        EditText editTextB = findViewById(R.id.edtB);
        EditText editTextKQ = findViewById(R.id.edtKQ);
        // Lấy dữ liệu ở điều khiển số A
        String strA = editTextA.getText().toString();
        // Lấy dữ liệu ở điều khiển số B
        String strB = editTextB.getText().toString();


        //  Chuyển dữ liệu sang số
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        // Tính toán theo yêu cầu
        int tong = soA + soB;
        // Chuyển sang dạng chuỗi
        String strTong = String.valueOf(tong);
        // Hiện ra màn hình
        editTextKQ.setText(strTong);
    }
}