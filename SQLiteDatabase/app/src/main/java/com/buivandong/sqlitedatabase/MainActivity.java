package com.buivandong.sqlitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edit_maLop, edit_tenLop, edit_siSo;
    Button insert_btn, delete_btn, update_btn, edit_query;
    ListView lv;
    ArrayList<String> myList = new ArrayList<>();
    SQLiteDatabase mydatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        mydatabase = openOrCreateDatabase("qlsinhvien.db", MODE_PRIVATE, null);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myList);

        lv.setAdapter(myAdapter);

        // Tạo các mã cơ sở dữ liệu
        // Tạo Table để chứa dữ liệu
        try {
            String sql = "CREATE TABLE tablelop(malop TEXT primary key, tenlop TEXT, siso INTEGER)";
            mydatabase.execSQL(sql);
        } catch(Exception e) {
            Log.e("Error", "Table đã tồn tại!");
        }

        insert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String malop = edit_maLop.getText().toString();
                String tenlop = edit_tenLop.getText().toString();
                int siso = Integer.parseInt(edit_siSo.getText().toString());
                ContentValues myvalue = new ContentValues();
                myvalue.put("maLop", malop);
                myvalue.put("tenLop", tenlop);
                myvalue.put("siso", siso);
                String message = "";
                if(mydatabase.insert("tablelop", null, myvalue) == -1) {
                    message = "Fail to Insert Record!";
                } else {
                    message = "Insert Record Success";
                }
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });

        delete_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String malop = edit_maLop.getText().toString();
                int n = mydatabase.delete("tablelop", "malop = ?", new String[]{malop});
                String message = "";
                if(n == 0) {
                    message = "No record to update!";
                } else {
                    message = n + " recode is delete";
                }
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });

        update_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int siso = Integer.parseInt(edit_siSo.getText().toString());
                String malop = edit_maLop.getText().toString();
                ContentValues myvalue = new ContentValues();
                myvalue.put("siso", siso);
                int n = mydatabase.update("tablelop", myvalue, "malop = ?", new String[]{malop});
                String message = "";
                if(n == 0) {
                    message = "No record to update!";
                } else {
                    message = n + " record update!";
                }
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });

        edit_query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myList.clear();
                Cursor c = mydatabase.query("tablelop", null, null, null, null, null, null);
                c.moveToFirst();
                String data = "";
                while(c.isAfterLast() == false) {
                    data = c.getString(0) + " - " + c.getString(1) + " - " + c.getString(2);
                    c.moveToNext();
                    myList.add(data);
                }
                c.close();
                myAdapter.notifyDataSetChanged();
            }
        });
    }

    private void findViews() {
        edit_maLop = findViewById(R.id.edit_text_malop);
        edit_tenLop = findViewById(R.id.edit_text_tenlop);
        edit_siSo = findViewById(R.id.edit_text_siso);
        update_btn = findViewById(R.id.btn_update);
        delete_btn = findViewById(R.id.btn_delete);
        insert_btn = findViewById(R.id.btn_insert);
        edit_query = findViewById(R.id.btn_query);
        lv = findViewById(R.id.list_view);
    }
}