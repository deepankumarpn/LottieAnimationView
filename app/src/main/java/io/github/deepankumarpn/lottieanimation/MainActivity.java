package io.github.deepankumarpn.lottieanimation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;
    Button btn_anim_loading;
    int animSize = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lottieAnimationView = findViewById(R.id.lottie_anim_view);
        btn_anim_loading = findViewById(R.id.btn_anim_loading);

        btn_anim_loading.setOnClickListener(view -> {
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
                    lottieAnimationView.setAnimation(R.raw.profile_created);
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
                    lottieAnimationView.setAnimation(R.raw.coming_soon);
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
    }
}