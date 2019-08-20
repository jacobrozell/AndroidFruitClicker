package com.example.fruitclicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    int score = 0;
    TextView scoreLabel;
    TextView clickButton;
    ImageView appleImage;

    int[] appleImageArray = {
            R.drawable.apple0,
            R.drawable.apple1,
            R.drawable.apple2,
            R.drawable.apple3,
            R.drawable.apple4,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreLabel = findViewById(R.id.scoreLabel);
        clickButton = findViewById(R.id.clickMeButton);
        appleImage = findViewById(R.id.imageView);
        appleImage.setImageResource(R.drawable.apple0);

        appleImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score++;
                int calc = score % appleImageArray.length;
                appleImage.setImageResource(appleImageArray[calc]);

                scoreLabel.setText(String.valueOf(score));

            }
        });
    }
}
