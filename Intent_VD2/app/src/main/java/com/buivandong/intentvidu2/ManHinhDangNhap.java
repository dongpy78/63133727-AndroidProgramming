package com.buivandong.intentvidu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ManHinhDangNhap extends AppCompatActivity {
    private EditText text_username;
    private EditText text_password;
    private EditText text_email;
    private Button btn_ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_dang_nhap);
        findsView();
        OnClickLogin();
    }

    private void findsView() {
        text_username = findViewById(R.id.edit_text_username);
        text_password = findViewById(R.id.edit_text_password);
        text_email = findViewById(R.id.edit_email);
        btn_ok = findViewById(R.id.btn_ok);
    }

    private void OnClickLogin() {
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = text_username.getText().toString();
                String password = text_password.getText().toString();
                String email = text_email.getText().toString();
                if(!isValidEmail(email)) {
                    showToast("Địa chỉ email không hợp lệ");
                    return;
                }
                if(username.equals("vandong") && password.equals("cntt2")) {
                    showToast("Đăng nhập thành công");
                    Intent intent = new Intent(ManHinhDangNhap.this, ManHinhChinh.class);
                    startActivity(intent);
                } else {
                    showToast("đăng nhập thất bại! Vui lòng kiểm tra lại username và password.");
                }
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }

    private boolean isValidEmail(CharSequence target) {
        return Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
}