package com.shubhankaranku.totoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CustomerSettingsActivity extends AppCompatActivity {

    private  EditText mNameInput, mNumberInput;
    private Button mConfirm, mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_settings);

        //Edit text initialization
        mNameInput = findViewById(R.id.name);
        mNumberInput = findViewById(R.id.phoneNumber);

        //Button initialization
        mConfirm = findViewById(R.id.confirm);
        mBack = findViewById(R.id.back);

        

    }
}