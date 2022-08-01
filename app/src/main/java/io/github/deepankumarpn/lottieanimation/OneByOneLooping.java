package io.github.deepankumarpn.lottieanimation;

import android.animation.Animator;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class OneByOneLooping extends AppCompatActivity {

    private LottieAnimationView lottieAnimViewOne, lottieAnimViewTwo;
    Thread threadOne, threadTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_by_one_looping);
        lottieAnimViewOne = findViewById(R.id.lottieAnimViewOne);
        lottieAnimViewTwo = findViewById(R.id.lottieAnimViewTwo);
        firstAnim();
    }

    private void firstAnim() {
        threadOne = new Thread(() -> {
            lottieAnimViewOne.setAnimation(R.raw.coming);
            lottieAnimViewOne.setRepeatCount(1);
            lottieAnimViewOne.setSpeed(1.0F);
            lottieAnimViewOne.playAnimation();
            lottieAnimViewOne.addAnimatorListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animator) {

                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    secondAnim();
                }

                @Override
                public void onAnimationCancel(Animator animator) {

                }

                @Override
                public void onAnimationRepeat(Animator animator) {

                }
            });
        });
        threadOne.start();
    }

    private void secondAnim() {
        threadTwo = new Thread(() -> {
            lottieAnimViewTwo.setAnimation(R.raw.digital_lending);
            lottieAnimViewTwo.setRepeatCount(1);
            lottieAnimViewTwo.setSpeed(1.0F);
            lottieAnimViewTwo.playAnimation();
            lottieAnimViewTwo.addAnimatorListener(new Animator.AnimatorListener() {
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
        });
        threadTwo.start();
    }
}