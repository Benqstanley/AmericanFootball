package com.example.android.americanfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.americanfootball.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    int scoreA = 0;
    int scoreB = 0;
    public void touchdownA(View view){
        scoreA = scoreA + 6;
        displayForTeamA(scoreA);
    }
    public void extraPointA(View view){
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }
    public void twoPointsA(View view){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }
    public void fieldGoalA(View view){
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void touchdownB(View view){
        scoreB = scoreB + 6;
        displayForTeamB(scoreB);
    }
    public void extraPointB(View view){
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }
    public void twoPointsB(View view){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }
    public void fieldGoalB(View view){
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void ResetScores(View view){
        scoreB = 0;
        scoreA = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
