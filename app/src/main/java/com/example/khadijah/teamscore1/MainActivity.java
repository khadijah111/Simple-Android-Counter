package com.example.khadijah.teamscore1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer scoreTeam1 = 0;
    Integer scoreTeam2 = 0;
    TextView team1Result;
    TextView team2Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team1Result = (TextView) findViewById(R.id.Team1Score);
        team2Result = (TextView) findViewById(R.id.Team2Score);
    }

    // add 1 score for Team1
    public void add1Team1(View view)
    {
        scoreTeam1++;
        updateResults();
    }

    // add 2 scores for Team1
    public void add2Team1(View view)
    {
        scoreTeam1 += 2;
        updateResults();
    }
    // add 3 scores for Team1
    public void add3Team1(View view)
    {
        scoreTeam1 += 3;
        updateResults();
    }

    // add 1 score for Team2
    public void add1Team2(View view)
    {
        scoreTeam2++;
        updateResults();
    }

    // add 2 scores for Team2
    public void add2Team2(View view)
    {
        scoreTeam2+=2;
        updateResults();
    }

    // add 3 scores for Team2
    public void add3Team2(View view)
    {
        scoreTeam2+=3;
        updateResults();
    }

    //Update the TextBoxes Results
    public void updateResults()
    {
        team1Result.setText("" +scoreTeam1);
        team2Result.setText("" +scoreTeam2);
    }

    //Reset the TextBoxes Scores to Zeros
    public void reset(View view)
    {
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        updateResults();
    }

}
