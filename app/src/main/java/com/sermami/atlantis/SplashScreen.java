package com.sermami.atlantis;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        getSupportActionBar().hide();

        openApp(true);

        ImageView pompa1 = findViewById(R.id.pompa1);
        ImageView pompa2 = findViewById(R.id.pompa2);
        ImageView pompa3 = findViewById(R.id.pompa3);
        ImageView pompa4 = findViewById(R.id.pompa4);
        ImageView pompa5 = findViewById(R.id.pompa5);
        ImageView pompa6 = findViewById(R.id.pompa6);
        ImageView pompa7 = findViewById(R.id.pompa7);
        ImageView pompa8 = findViewById(R.id.pompa8);


        Animation scale = AnimationUtils.loadAnimation(this,R.anim.scale);
        pompa1.startAnimation(scale);
        pompa2.startAnimation(scale);
        pompa3.startAnimation(scale);
        pompa4.startAnimation(scale);
        pompa5.startAnimation(scale);
        pompa6.startAnimation(scale);
        pompa7.startAnimation(scale);
        pompa8.startAnimation(scale);
    }

    public void openApp(boolean locationPermission){

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);

               /* intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);*/

                startActivity(intent);
            }
        }, 80000);
    }
}
