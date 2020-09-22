package com.example.zhihuapp.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.zhihuapp.R;

public class RegisterActivity extends AppCompatActivity {
   private EditText etuser2,etpass2,email,etnum;
   private Button btnreg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initViews();
    }

    @SuppressLint("WrongViewCast")
    private void initViews() {
        etuser2 = findViewById(R.id.etuser2);
        etpass2 = findViewById(R.id.etpass2);
        email = findViewById(R.id.email);
        etnum = findViewById(R.id.etnum);
        btnreg2 = findViewById(R.id.btnrge2);

    }


}
