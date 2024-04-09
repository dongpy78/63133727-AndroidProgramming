package com.buivandong.bai_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText text_username;
    private EditText text_password;
    private Button btn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        OnClickLogin();
    }

    private void findViews() {
        text_username = findViewById(R.id.edit_text_username);
        text_password = findViewById(R.id.edit_text_password);
        btn_login = findViewById(R.id.btn_login);
    }

    private void OnClickLogin() {
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = text_username.getText().toString();
                String password = text_password.getText().toString();
                if(username.equals("maicuongtho") && password.equals("Cntt63ntu!")) {
                    showToast("User and Password is correct!");
                } else {
                    showToast("User and Password is wrong");
                }
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}