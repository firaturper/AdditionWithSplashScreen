package com.example.additionwithsplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.additionwithsplashscreen.R;

public class MainActivity2 extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView result;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);
        result = findViewById(R.id.textView);
        add = findViewById(R.id.button);

        add.setOnClickListener(new View.OnClickListener() {

            public void onClick (View view) {

                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double res = number1 + number2;

                result.setText(Double.toString(res));

            }

        });
    }
}