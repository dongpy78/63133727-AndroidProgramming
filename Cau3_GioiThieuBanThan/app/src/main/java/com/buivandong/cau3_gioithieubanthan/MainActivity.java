package com.buivandong.cau3_gioithieubanthan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView textName ;
    private TextView textEmail ;
    private TextView textEducation ;
    private TextView textAddress ;
    private Button show_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        HienThiThongTin();
    }

    private void findViews() {
        textName = findViewById(R.id.text_name);
        textEmail = findViewById(R.id.text_email);
        textEducation = findViewById(R.id.text_education);
        textAddress = findViewById(R.id.text_address);
        show_info = findViewById(R.id.btn_show_info);
    }

    private void HienThiThongTin() {
        show_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = textName.getText().toString();
                String email = textEmail.getText().toString();
                String education = textEducation.getText().toString();
                String address = textAddress.getText().toString();

                showInfoDialog(name, email, education, address);

            }
        });
    }

    private void showInfoDialog(String name, String email, String education, String address) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Thông tin! ");
        builder.setMessage("Name: " + name + "\nEmail: " + email + "\nEducation: " + education + "\nAddress: " + address);
        builder.setPositiveButton("OK", null);

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}