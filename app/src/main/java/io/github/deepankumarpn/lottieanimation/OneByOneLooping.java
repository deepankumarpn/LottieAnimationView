package io.github.deepankumarpn.lottieanimation;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


import io.github.deepankumarpn.lottieanimation.databinding.ActivityOneByOneLoopingBinding;

public class OneByOneLooping extends AppCompatActivity {

    private ActivityOneByOneLoopingBinding activityOneByOneLoopingBinding;
    private int animCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityOneByOneLoopingBinding = ActivityOneByOneLoopingBinding.inflate(getLayoutInflater());
        setContentView( activityOneByOneLoopingBinding.getRoot());
        animLooping();
        setOnclickListner();
    }

    private void setOnclickListner() {
        activityOneByOneLoopingBinding.restartLoopButton.setOnClickListener(view -> {
            animCount =0;
            animLooping();
            activityOneByOneLoopingBinding.statusTextView.setText("");
            activityOneByOneLoopingBinding.restartLoopButton.setVisibility(View.GONE);
        });
    }

    private void animLooping() {
        activityOneByOneLoopingBinding.lottieAnimViewOne.setAnimation(R.raw.coming);
        activityOneByOneLoopingBinding.lottieAnimViewOne.setRepeatCount(1);
        activityOneByOneLoopingBinding.lottieAnimViewOne.setSpeed(1.0F);
        activityOneByOneLoopingBinding.lottieAnimViewOne.playAnimation();
        activityOneByOneLoopingBinding.lottieAnimViewOne.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                animCount++;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                activityOneByOneLoopingBinding.lottieAnimViewTwo.playAnimation();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        activityOneByOneLoopingBinding.lottieAnimViewTwo.setAnimation(R.raw.digital_lending);
        activityOneByOneLoopingBinding.lottieAnimViewTwo.setRepeatCount(1);
        activityOneByOneLoopingBinding.lottieAnimViewTwo.setSpeed(1.0F);
        activityOneByOneLoopingBinding.lottieAnimViewTwo.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                activityOneByOneLoopingBinding.lottieAnimViewThree.playAnimation();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        activityOneByOneLoopingBinding.lottieAnimViewThree.setAnimation(R.raw.qa);
        activityOneByOneLoopingBinding.lottieAnimViewThree.setRepeatCount(1);
        activityOneByOneLoopingBinding.lottieAnimViewThree.setSpeed(1.0F);
        activityOneByOneLoopingBinding.lottieAnimViewThree.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                activityOneByOneLoopingBinding.lottieAnimViewFour.playAnimation();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        activityOneByOneLoopingBinding.lottieAnimViewFour.setAnimation(R.raw.reward_received);
        activityOneByOneLoopingBinding.lottieAnimViewFour.setRepeatCount(1);
        activityOneByOneLoopingBinding.lottieAnimViewFour.setSpeed(1.0F);
        activityOneByOneLoopingBinding.lottieAnimViewFour.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                activityOneByOneLoopingBinding.lottieAnimViewFive.playAnimation();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        activityOneByOneLoopingBinding.lottieAnimViewFive.setAnimation(R.raw.earn_reward);
        activityOneByOneLoopingBinding.lottieAnimViewFive.setRepeatCount(1);
        activityOneByOneLoopingBinding.lottieAnimViewFive.setSpeed(1.0F);
        activityOneByOneLoopingBinding.lottieAnimViewFive.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                activityOneByOneLoopingBinding.lottieAnimViewSix.playAnimation();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        activityOneByOneLoopingBinding.lottieAnimViewSix.setAnimation(R.raw.sand_loader);
        activityOneByOneLoopingBinding.lottieAnimViewSix.setRepeatCount(1);
        activityOneByOneLoopingBinding.lottieAnimViewSix.setSpeed(1.0F);
        activityOneByOneLoopingBinding.lottieAnimViewSix.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @SuppressLint("SetTextI18n")
            @Override
            public void onAnimationEnd(Animator animator) {
               if (animCount == 2){
                   activityOneByOneLoopingBinding.statusTextView.setText(" Loop stopped");
                   activityOneByOneLoopingBinding.restartLoopButton.setVisibility(View.VISIBLE);
               }else{
                   activityOneByOneLoopingBinding.lottieAnimViewOne.playAnimation();
               }
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