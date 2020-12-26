package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public void Converter(View view){
    EditText amountEditText =(EditText) findViewById(R.id.amountEditText);
    String dd = amountEditText.getText().toString();
    double d = Double.parseDouble(dd);
    double Amount = d*1.17; //definirati novu varijablu u koju ce ic broj iz stringa
    Log.i("info", "pressed");
    Log.i("Value", amountEditText.getText().toString());
    String amountString =String.format ("%.2f",Amount); // na 2 decimale
    Toast.makeText(this, "€"+ dd + " is $"+ amountString, Toast.LENGTH_SHORT).show();


}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}