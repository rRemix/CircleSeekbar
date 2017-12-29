package com.remix.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.remix.circleseekbar.CircleSeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.process);
        CircleSeekBar mCircleSeekbar = findViewById(R.id.circleSeekbar);
        mCircleSeekbar.setOnSeekBarChangeListener(new CircleSeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(CircleSeekBar seekBar, long progress) {
                textView.setText("Progress: " + progress);
            }

            @Override
            public void onStartTrackingTouch(CircleSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(CircleSeekBar seekBar) {

            }
        });

    }
}
