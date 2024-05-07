package com.buivandong.buttonnavigationbar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class HomeFragment extends Fragment {
    private EditText text_one;
    private EditText text_two;
    private EditText text_result;
    private Button cong_btn;
    private Button tru_btn;
    private Button nhan_btn;
    private Button chia_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        findViews(view);
        OnClickBtnCong();
        OnClickBtnTru();
        OnClickBtnNhan();
        OnClickBtnChia();

        return view;
    }

    private void findViews(View view) {
        text_one = view.findViewById(R.id.edit_text_one);
        text_two = view.findViewById(R.id.edit_text_two);
        text_result = view.findViewById(R.id.edit_text_result);
        cong_btn = view.findViewById(R.id.btn_cong);
        tru_btn = view.findViewById(R.id.btn_tru);
        nhan_btn = view.findViewById(R.id.btn_nhan);
        chia_btn = view.findViewById(R.id.btn_chia);
    }

    private void OnClickBtnCong() {
        cong_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyCong();
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

    private void xuLyCong() {
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
        Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
    }

}