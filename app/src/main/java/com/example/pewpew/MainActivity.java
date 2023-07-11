package com.example.pewpew;

import androidx.appcompat.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import android.os.Bundle;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        setContentView(new Game (this));
    }
}