package io.github.deepankumarpn.lottieanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.github.deepankumarpn.lottieanimation.databinding.ActivityBottomNavigationBinding;

public class BottomNavigationActivity extends AppCompatActivity {
    private ActivityBottomNavigationBinding activityBottomNavigationBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityBottomNavigationBinding = ActivityBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(activityBottomNavigationBinding.getRoot());
    }
}