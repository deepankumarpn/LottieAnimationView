package io.github.deepankumarpn.lottieanimation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieListener;

public class MainActivity extends AppCompatActivity {
    private LottieAnimationView lottieAnimationView;
    private Button btnAnimLoading,oneByOneLooping;
    private int animSize = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lottieAnimationView = findViewById(R.id.lottieAnimView);
        btnAnimLoading = findViewById(R.id.btnAnimLoading);
        oneByOneLooping = findViewById(R.id.oneByOneLooping);
        lottieAnimationView.setFailureListener(new LottieListener<Throwable>() {
            @Override
            public void onResult(Throwable result) {
                Log.v("LOTERR", "LOTERR " + result.getMessage());
                Toast.makeText(getApplicationContext(), result.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        btnAnimLoading.setOnClickListener(view -> {
            animSize++;
            switch (animSize) {
                case 1:
                    lottieAnimationView.setAnimation(R.raw.anim_loading);
                    break;
                case 2:
                    lottieAnimationView.setAnimation(R.raw.digital_lending);
                    break;
                case 3:
                    lottieAnimationView.setAnimation(R.raw.earn_reward);
                    break;
                case 4:
                    lottieAnimationView.setAnimation(R.raw.kyc_incomplete);
                    break;
                case 5:
                    lottieAnimationView.setAnimation(R.raw.kyc_verified);
                    break;
                case 6:
                    lottieAnimationView.setAnimation(R.raw.lot_created);
                    break;
                case 7:
                    lottieAnimationView.setAnimation(R.raw.no_data);
                    break;
                case 8:
                    lottieAnimationView.setAnimation(R.raw.order_created);
                    break;
                case 9:
                    lottieAnimationView.setAnimation(R.raw.digital_lending);
                    break;
                case 10:
                    lottieAnimationView.setAnimation(R.raw.qa);
                    break;
                case 11:
                    lottieAnimationView.setAnimation(R.raw.reward_received);
                    break;
                case 12:
                    lottieAnimationView.setAnimation(R.raw.sand_loader);
                    break;
                case 13:
                    lottieAnimationView.setAnimation(R.raw.small_success_mark);
                    break;
                case 14:
                    lottieAnimationView.setAnimation(R.raw.coming);
                    break;
                case 15:
                    lottieAnimationView.setAnimation(R.raw.no_notification);
                    animSize = 0;
                    break;
            }
            lottieAnimationView.setRepeatCount(ValueAnimator.INFINITE);
            lottieAnimationView.setSpeed(1.0F);
            lottieAnimationView.playAnimation();
        });

        lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {

            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        oneByOneLooping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),OneByOneLooping.class);
                startActivity(intent);
            }
        });
    }
}