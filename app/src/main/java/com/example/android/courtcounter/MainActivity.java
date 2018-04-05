package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   int scoreTeamA = 0;
   int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int sixA (View view){
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
        return scoreTeamA;
    }
    public int fourA (View view){
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
        return scoreTeamA;
    }
    public int singleA (View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
        return scoreTeamA;
    }

    public int sixB (View view){
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
        return scoreTeamB;
    }
    public int fourB (View view){
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);
        return scoreTeamB;
    }
    public int singleB (View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
        return scoreTeamB;
    }
    public void reset (View view){
        if(scoreTeamA>scoreTeamB){
            Toast.makeText(this,"Team A has Won the Match !!  score: " + scoreTeamA,Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Team B has Won the Match !!  score: " + scoreTeamB,Toast.LENGTH_SHORT).show();
        }
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
