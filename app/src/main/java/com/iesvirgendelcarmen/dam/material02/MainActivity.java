package com.iesvirgendelcarmen.dam.material02;

import android.animation.Animator;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton fab;
    private Interpolator interpolador;
     private boolean tocado = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = (FloatingActionButton)findViewById(R.id.FAB);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "FAB tocado",Toast.LENGTH_SHORT).show();
                tocado = !tocado;
                view.animate().rotation(tocado ? 200f :0).setInterpolator(interpolador).start();
                fab.animate().scaleY(0).scaleX(0).setInterpolator(interpolador).setDuration(600).start();



            }
        });
        fab.setScaleX(0);
        fab.setScaleY(0);

       interpolador= AnimationUtils.loadInterpolator(getBaseContext(),
                android.R.interpolator.fast_out_slow_in);
        fab.animate().scaleX(1).scaleY(1).setInterpolator(interpolador).setDuration(600).setStartDelay(1000). setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });



    }
}
