package com.dev_candra.example_login_with_animation;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private Animation topAniamtion,bottomAnimation;
    private TextView teksLogo,teksPembuat;
    private ImageView mobil_balap;
    private static final int SplashScreen = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        topAniamtion = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        teksLogo = findViewById(R.id.teksLogo);
        teksPembuat = findViewById(R.id.teksPembuat);
        mobil_balap = findViewById(R.id.image1);
        loadAnimation();
    }

    private void loadAnimation() {
        teksLogo.setAnimation(topAniamtion);
        teksPembuat.setAnimation(bottomAnimation);
        mobil_balap.setAnimation(topAniamtion);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }
        },SplashScreen);

    }
}
