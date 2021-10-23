package com.example.additionwithsplashscreen;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;

import com.example.additionwithsplashscreen.R;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIME_OUT=2000;
    // 2000 ms tamamlandıktan sonra bir sonraki aktivite başlayacak
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Bu metot splash activity için kullanılır. Tüm ekranı kaplar.

        setContentView(R.layout.activity_main);
        //Bu kod satırı MainActivity.class dosyasını activity_main.xml e bağlar

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                //Intent'ler bir activity'den diğer bir activity'ye geçmek için kullanılır.
                // İkinci bir activity açmak için yani MainActivity2.java dosyası şöyle açıldı
                // File - New - Gallery - Empty Activity seçimi yapılarak açıldı.
                startActivity(i);
                //MainActivity2 çağrılır

                finish();
                //Mevcut activity sonlandırılıyor
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}
