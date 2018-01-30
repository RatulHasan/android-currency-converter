package com.besofty.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view){

        try {
            EditText currencyAmount = (EditText) findViewById(R.id.currencyAmount);

            Double convertAmount = Double.parseDouble(currencyAmount.getText().toString());

            Double amount = convertAmount*83.19;

//            Toast.makeText(MainActivity.this, String.format("%.2f", amount)+ " tk", Toast.LENGTH_SHORT).show();

            TextView tvName = (TextView)findViewById(R.id.convertedAmount);
            tvName.setText(currencyAmount.getText().toString()+" dollar is equal to "+amount.toString()+" tk");

        }catch (NumberFormatException e){
            Log.i("Error", e.toString());
        }
    }
}
