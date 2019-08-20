package com.example.fruitclicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    TextView scoreLabel;
    Button clickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreLabel = (TextView) findViewById(R.id.scoreLabel);
        clickButton = (Button) findViewById(R.id.clickMeButton);


        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score++;
                scoreLabel.setText(String.valueOf(score));
            }
        });
    }
}
