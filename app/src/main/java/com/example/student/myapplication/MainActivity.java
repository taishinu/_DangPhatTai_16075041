package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2;
    EditText edttk, edtmk;
    Button dangnhap;
    CheckBox luu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        edttk = (EditText)findViewById(R.id.edtTK);
        edtmk = (EditText)findViewById(R.id.edtMK);
        luu = (CheckBox) findViewById(R.id.cbLuu);
        dangnhap = (Button)findViewById(R.id.btnDN);
        dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (luu.isChecked()) {
                    Toast toast = Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu",Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(MainActivity.this,"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
