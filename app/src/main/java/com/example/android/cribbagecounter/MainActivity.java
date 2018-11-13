package com.example.android.cribbagecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePlayerOne = 0;
    int scorePlayerTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForPlayerOne (int scorePlayerOne) {
        TextView scoreView = findViewById(R.id.scorePlayerOne);
        scoreView.setText(String.valueOf(scorePlayerOne));
    }

    public void addOneToPlayerOneScore (View v) {
        scorePlayerOne = (scorePlayerOne + 1);
        displayForPlayerOne(scorePlayerOne);
    }

    public void addTwoToPlayerOneScore (View v) {
        scorePlayerOne = (scorePlayerOne + 2);
        displayForPlayerOne(scorePlayerOne);
    }

    public void addThreeToPlayerOneScore (View v) {
        scorePlayerOne = (scorePlayerOne + 3);
        displayForPlayerOne(scorePlayerOne);
    }

    public void addFourToPlayerOneScore (View v) {
        scorePlayerOne = (scorePlayerOne + 4);
        displayForPlayerOne(scorePlayerOne);
    }

    public void addFiveToPlayerOneScore (View v) {
        scorePlayerOne = (scorePlayerOne + 5);
        displayForPlayerOne(scorePlayerOne);
    }

    public void addSixToPlayerOneScore (View v) {
        scorePlayerOne = (scorePlayerOne + 6);
        displayForPlayerOne(scorePlayerOne);
    }

    public void addSevenToPlayerOneScore (View v) {
        scorePlayerOne = (scorePlayerOne + 7);
        displayForPlayerOne(scorePlayerOne);
    }

    public void addEightToPlayerOneScore (View v) {
        scorePlayerOne = (scorePlayerOne + 8);
        displayForPlayerOne(scorePlayerOne);
    }

    public void addNineToPlayerOneScore (View v) {
        scorePlayerOne = (scorePlayerOne + 9);
        displayForPlayerOne(scorePlayerOne);
    }
    public void addTenToPlayerOneScore (View v) {
        scorePlayerOne = (scorePlayerOne + 10);
        displayForPlayerOne(scorePlayerOne);
    }

    public void addTwelveToPlayerOneScore (View v) {
        scorePlayerOne = (scorePlayerOne + 12);
        displayForPlayerOne(scorePlayerOne);
    }

    public void addFourteenToPlayerOneScore (View v) {
        scorePlayerOne = (scorePlayerOne + 14);
        displayForPlayerOne(scorePlayerOne);
    }

    public void addSixteenToPlayerOneScore (View v) {
        scorePlayerOne = (scorePlayerOne + 16);
        displayForPlayerOne(scorePlayerOne);
    }

    //*
    public void displayForPlayerTwo (int scorePlayerTwo) {
        TextView scoreView = findViewById(R.id.scorePlayerTwo);
        scoreView.setText(String.valueOf(scorePlayerTwo));
    }

    //* Adds 1 to player 2's score
    public void addOneToPlayerTwoScore (View v) {
        scorePlayerTwo = (scorePlayerTwo + 1);
        displayForPlayerTwo(scorePlayerTwo);
    }

    //* Adds 2 to player 2's score
    public void addTwoToPlayerTwoScore (View v) {
        scorePlayerTwo = (scorePlayerTwo + 2);
        displayForPlayerTwo(scorePlayerTwo);
    }

    //* Adds 3 to player 2's score
    public void addThreeToPlayerTwoScore (View v) {
        scorePlayerTwo = (scorePlayerTwo + 3);
        displayForPlayerTwo(scorePlayerTwo);
    }

    //* Adds 4 to player 2's score
    public void addFourToPlayerTwoScore (View v) {
        scorePlayerTwo = (scorePlayerTwo + 4);
        displayForPlayerTwo(scorePlayerTwo);
    }

    //* Adds 5 to player 2's score
    public void addFiveToPlayerTwoScore (View v) {
        scorePlayerTwo = (scorePlayerTwo + 5);
        displayForPlayerTwo(scorePlayerTwo);
    }

    //* Adds 6 to player 2's score
    public void addSixToPlayerTwoScore (View v) {
        scorePlayerTwo = (scorePlayerTwo + 6);
        displayForPlayerTwo(scorePlayerTwo);
    }

    //* Adds 7 to player 2's score
    public void addSevenToPlayerTwoScore (View v) {
        scorePlayerTwo = (scorePlayerTwo + 7);
        displayForPlayerTwo(scorePlayerTwo);
    }

    //* Adds 8 to player 2's score
    public void addEightToPlayerTwoScore (View v) {
        scorePlayerTwo = (scorePlayerTwo + 8);
        displayForPlayerTwo(scorePlayerTwo);
    }

    //* Adds 9 to player 2's score
    public void addNineToPlayerTwoScore (View v) {
        scorePlayerTwo = (scorePlayerTwo + 9);
        displayForPlayerTwo(scorePlayerTwo);
    }

    //* Adds 10 to player 2's score
    public void addTenToPlayerTwoScore (View v) {
        scorePlayerTwo = (scorePlayerTwo + 10);
        displayForPlayerTwo(scorePlayerTwo);
    }

    //* Adds 12 to player 2's score
    public void addTwelveToPlayerTwoScore (View v) {
        scorePlayerTwo = (scorePlayerTwo + 12);
        displayForPlayerTwo(scorePlayerTwo);
    }

    //* Adds 14 to player 2's score
    public void addFourteenToPlayerTwoScore (View v) {
        scorePlayerTwo = (scorePlayerTwo + 14);
        displayForPlayerTwo(scorePlayerTwo);
    }

    //* Adds 16 to player 2's score
    public void addSixteenToPlayerTwoScore (View v) {
        scorePlayerTwo = (scorePlayerTwo + 16);
        displayForPlayerTwo(scorePlayerTwo);
    }

    //* Resets both players scores back to zero
    public void resetPlayerScores (View v) {
        scorePlayerOne = 0;
        scorePlayerTwo = 0;
        displayForPlayerOne(scorePlayerOne);
        displayForPlayerTwo(scorePlayerTwo);
    }
}
