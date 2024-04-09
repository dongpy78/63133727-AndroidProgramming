package com.buivandong.listviewfirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> ds_list_items = new ArrayList<>();
    ArrayAdapter<String> adapterItem;
    private EditText textNumber;
    private EditText textResult;
    private Button btnSave;
    private Button btnEdit;
    private Button btnRemove;
    private int selectedItemPosition = -1;

    ListView listViewItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        ds_list_items.add("Content");
        ds_list_items.add("Graphics");
        ds_list_items.add("Hardware");
        ds_list_items.add("Media");
        ds_list_items.add("NFC");
        ds_list_items.add("OS");



        adapterItem = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ds_list_items);

        listViewItem = findViewById(R.id.list_view_items);
        listViewItem.setAdapter(adapterItem);
        listViewItem.setOnItemClickListener(BoLangNghevaXL);

        OnClickSave();
        OnClickEdit();
        OnClickRemove();
    }

    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String strItemSelect = ds_list_items.get(i);

            textNumber.setText(String.valueOf(i  +1));
            textResult.setText(strItemSelect);

            selectedItemPosition = i;

            // i là vị trí của phần tử vừa được click
            String strTenTinhChon = ds_list_items.get(i);

            Toast.makeText(MainActivity.this, strItemSelect, Toast.LENGTH_SHORT).show();
        }
    };

    private void findViews() {
        textNumber = findViewById(R.id.edit_text_number);
        textResult = findViewById(R.id.edit_text_result);
        btnSave = findViewById(R.id.btn_save);
        btnEdit = findViewById(R.id.btn_edit);
        btnRemove = findViewById(R.id.btn_remove);
    }

    private void OnClickSave() {
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newItem = textResult.getText().toString();
                if (!newItem.isEmpty()) {
                    ds_list_items.add(newItem); // Thêm vào danh sách
                    adapterItem.notifyDataSetChanged(); // Cập nhật ListView
                    textNumber.setText("");
                    textResult.setText(""); // Xóa nội dung EditText sau khi thêm
                    Toast.makeText(MainActivity.this, "Bạn đã thêm thành công!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập một giá trị", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }

    // Phương thức tương tự cho việc sửa đổi
    private void OnClickEdit() {
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedItemPosition != -1) { // Đảm bảo đã chọn một mục để sửa
                    String newValue = textResult.getText().toString();
                    if (!newValue.isEmpty()) {
                        ds_list_items.set(selectedItemPosition, newValue); // Sửa đổi giá trị trong danh sách
                        adapterItem.notifyDataSetChanged(); // Cập nhật ListView
                        textNumber.setText("");
                        textResult.setText(""); // Xóa nội dung EditText sau khi sửa
                        selectedItemPosition = -1; // Đặt lại vị trí đã chọn
                        Toast.makeText(MainActivity.this, "Bạn đã sửa thành công!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Vui lòng nhập một giá trị", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Vui lòng chọn một mục để sửa", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Phương thức tương tự cho việc xóa
    private void OnClickRemove() {
        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedItemPosition != -1) { // Đảm bảo đã chọn một mục để xóa
                    ds_list_items.remove(selectedItemPosition); // Xóa mục khỏi danh sách
                    adapterItem.notifyDataSetChanged(); // Cập nhật ListView
                    textNumber.setText("");
                    textResult.setText(""); // Xóa nội dung EditText
                    selectedItemPosition = -1; // Đặt lại vị trí đã chọn
                    Toast.makeText(MainActivity.this, "Đã xóa thành công!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Vui lòng chọn một mục để xóa", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}