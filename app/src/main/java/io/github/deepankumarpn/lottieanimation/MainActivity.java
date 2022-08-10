package io.github.deepankumarpn.lottieanimation;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import io.github.deepankumarpn.lottieanimation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private int animSize = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        activityMainBinding.lottieAnimView.setFailureListener(result -> {
            Log.v("LOTERR", "LOTERR " + result.getMessage());
            Toast.makeText(getApplicationContext(), result.getMessage(), Toast.LENGTH_SHORT).show();
        });

        activityMainBinding.btnAnimLoading.setOnClickListener(view -> {
            animSize++;
            switch (animSize) {
                case 1:
                    activityMainBinding.lottieAnimView.setAnimation(R.raw.anim_loading);
                    break;
                case 2:
                    activityMainBinding.lottieAnimView.setAnimation(R.raw.coming);
                    break;
                case 3:
                    activityMainBinding.lottieAnimView.setAnimation(R.raw.digital_lending);
                    break;
                case 4:
                    activityMainBinding.lottieAnimView.setAnimation(R.raw.earn_reward);
                    break;
                case 5:
                    activityMainBinding.lottieAnimView.setAnimation(R.raw.kyc_incomplete);
                    break;
                case 6:
                    activityMainBinding.lottieAnimView.setAnimation(R.raw.kyc_verified);
                    break;
                case 7:
                    activityMainBinding.lottieAnimView.setAnimation(R.raw.lot_created);
                    break;
                case 8:
                    activityMainBinding.lottieAnimView.setAnimation(R.raw.no_data);
                    break;
                case 9:
                    activityMainBinding.lottieAnimView.setAnimation(R.raw.no_notification);
                    break;
                case 10:
                    activityMainBinding.lottieAnimView.setAnimation(R.raw.order_created);
                    break;
                case 11:
                    activityMainBinding.lottieAnimView.setAnimation(R.raw.qa);
                    break;
                case 12:
                    activityMainBinding.lottieAnimView.setAnimation(R.raw.reward_received);
                    break;
                case 13:
                    activityMainBinding.lottieAnimView.setAnimation(R.raw.sand_loader);
                    break;
                case 14:
                    activityMainBinding.lottieAnimView.setAnimation(R.raw.small_success_mark);
                    animSize = 0;
                    break;
            }
            activityMainBinding.lottieAnimView.setRepeatCount(ValueAnimator.INFINITE);
            activityMainBinding.lottieAnimView.setSpeed(1.0F);
            activityMainBinding.lottieAnimView.playAnimation();
        });

        activityMainBinding.oneByOneLooping.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(),OneByOneLooping.class);
            startActivity(intent);
        });
        activityMainBinding.BtnBottomAnimation.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(),BottomNavigationActivity.class);
            startActivity(intent);
        });
    }
}