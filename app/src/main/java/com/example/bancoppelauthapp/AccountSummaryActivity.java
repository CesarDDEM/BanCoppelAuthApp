package com.example.bancoppelauthapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AccountSummaryActivity extends AppCompatActivity {

    private TextView balanceTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_summary);

        balanceTextView = findViewById(R.id.balanceTextView);
        displayAccountDetails();
    }

    private void displayAccountDetails(){
        // Aquí puedes cargar los datos reales del usuario
        String balance = "$25,999.00";
        balanceTextView.setText("Saldo: " +balance);
    }
}