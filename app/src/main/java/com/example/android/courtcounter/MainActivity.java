package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayFortTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA+3;
        displayFortTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA+2;
        displayFortTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View view) {
        scoreTeamA++;
        displayFortTeamA(scoreTeamA);
    }

    public void displayFortTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB+3;
        displayFortTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB+2;
        displayFortTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View view) {
        scoreTeamB++;
        displayFortTeamB(scoreTeamB);
    }

    public void reset(View view) {
        displayFortTeamA(0);
        displayFortTeamB(0);
        scoreTeamA = 0;
        scoreTeamB = 0;
    }
}