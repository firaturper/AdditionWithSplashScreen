// Bu MainAktivity2 dosyası 2. aktiviteyi yani uygulamada açılan a2. sayfayı ifade etmektedir.
package com.example.additionwithsplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.additionwithsplashscreen.R;
//Bu aktivitiy'de temel bir toplama işlemi yapılmaktadır.

public class MainActivity2 extends AppCompatActivity {

// 2 adet EditText, 1 TextView ve 1 buton tanımlanmaktadır.     
   
    EditText num1;
    EditText num2;
    TextView result;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

  //override edilen onCreate metodunda daha önce tanımlanan EditText, TextView ve buton tanımlanıyor.
  // Yani arayüzde girilen değerler burada tanımlanarak işleme hazır hale getiriliyor.
        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);
        result = findViewById(R.id.textView);
        add = findViewById(R.id.button);

 // add butonu tıklandığında OnClick metodu devreye girer ve gerekli sayısal işlemi gerçekleştirir.       
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view) {

                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double res = number1 + number2;
// İşlem sonucu TextView'de gösterilecektir.
                result.setText(Double.toString(res));
                

            }

        });
    }
}
