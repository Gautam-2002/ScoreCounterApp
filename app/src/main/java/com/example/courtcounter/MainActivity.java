package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

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
    /*
    +3 to team A
     */
    public void add3ToTeamA(View view){
        scoreTeamA =  scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    /*
    +2 to team A
     */
    public void add2ToTeamA(View view){
        scoreTeamA =  scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    /*
    +1 to team A
     */
    public void add1ToTeamA(View view){
        scoreTeamA =  scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    /*
    displayscore for team A
     */
    public void displayForTeamA(int score){
        TextView scoreView =(TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /*
    +3 to team B
     */
    public void add3ToTeamB(View view){
        scoreTeamB =  scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    /*
    +2 to team B
     */
    public void add2ToTeamB(View view){
        scoreTeamB =  scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    /*
    +1 to team B
     */
    public void add1ToTeamB(View view){
        scoreTeamB =  scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    /*
    reset score of both teams
     */
    public void resetScore(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /*
    displayscore for team B
     */
    public void displayForTeamB(int score){
        TextView scoreView =(TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}