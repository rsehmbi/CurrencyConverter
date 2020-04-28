package com.myappcompany.rob.exampleproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Convert(View view)
    {
        TextView amountTextView = (TextView) findViewById(R.id.amountText);

        if (!amountTextView.getText().toString().matches(""))
        {
            double number = Double.parseDouble(amountTextView.getText().toString());
            number = number * 0.80;
            Toast.makeText(this,"Amount in Pounds is " + number ,Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"Please Enter the Amount",Toast.LENGTH_SHORT).show();
        }

        Log.i("Info", "Button is now pressed");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
