package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.Console;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Initializes ImageView and Button.
    private ImageView ballDisplay;
    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating ImageView and Button.
        ballDisplay = (ImageView)findViewById(R.id.image_eightball);
        myButton = (Button)findViewById(R.id.askbutton);

        //creates an array of images.
        //Final, so that it cannot be changed.
        final int[] ballArray = new int[]{R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,
        R.drawable.ball4, R.drawable.ball5};

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // creates an object for random number.
                Random randomNumber = new Random();

                //variable holds the random number object. Random numbers from 0-4.
                int number = randomNumber.nextInt(5);

                // Get images from the image array randomly and set that in the ImageView.
                ballDisplay.setImageResource(ballArray[number]);

            }// end of onClick
        });// end of setOnClickListener.

    }// end of onCreate.

}// end of MainActivity.
