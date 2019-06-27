package com.example.android.gallicricket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int runs_a=0;

    /*Variables Required For Team A*/
    int wickets_a=0;
    int runs_b=0;

    /*Variables Required For Team B*/
    int wickets_b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*Display the runs scored by team A*/

    public void displayRunsForTeamA(int score){
        TextView scoreView=findViewById(R.id.runs_a);
        scoreView.setText(String.valueOf(score));
    }
    /*Display the wickets lost by team A*/

    public void displayWicketsForTeamA(int wicket){
        TextView wicketView=findViewById(R.id.wickets_a);
        wicketView.setText(String.valueOf(wicket));
    }

    /*Function to add a run when Dot or Wide*/

    public void addOneRunToA(View view){
        runs_a += 1;
        displayRunsForTeamA(runs_a);
    }

    /*Function to add 2 runs when 2 is clicked*/

    public void addTwoRunsToA(View view){
        runs_a += 2;
        displayRunsForTeamA(runs_a);
    }

    /*Function to add 4 runs when 4 is clicked*/

    public void addFourRunsToA(View view){
        runs_a += 4;
        displayRunsForTeamA(runs_a);
    }

    /*Function to add 6 runs when 6 is clicked*/

    public void addSixRunsToA(View view){
        runs_a += 6;
        displayRunsForTeamA(runs_a);
    }

    /*Function to Update Wicket*/

    public void wicketToA(View view)
    {
        switch (wickets_a)
        {
            case 0:
                wickets_a ++;
                displayWicketsForTeamA(wickets_a);
                Toast.makeText(MainActivity.this,"9 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 1:
                wickets_a ++;
                displayWicketsForTeamA(wickets_a);
                Toast.makeText(MainActivity.this,"8 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 2:
                wickets_a ++;
                displayWicketsForTeamA(wickets_a);
                Toast.makeText(MainActivity.this,"7 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 3:
                wickets_a ++;
                displayWicketsForTeamA(wickets_a);
                Toast.makeText(MainActivity.this,"6 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 4:
                wickets_a ++;
                displayWicketsForTeamA(wickets_a);
                Toast.makeText(MainActivity.this,"5 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 5:
                wickets_a ++;
                displayWicketsForTeamA(wickets_a);
                Toast.makeText(MainActivity.this,"4 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 6:
                wickets_a ++;
                displayWicketsForTeamA(wickets_a);
                Toast.makeText(MainActivity.this,"3 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 7:
                wickets_a ++;
                displayWicketsForTeamA(wickets_a);
                Toast.makeText(MainActivity.this,"2 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 8:
                wickets_a ++;
                displayWicketsForTeamA(wickets_a);
                Toast.makeText(MainActivity.this,"1 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 9:
                wickets_a ++;
                displayWicketsForTeamA(wickets_a);
                break;
        }
        if(wickets_a==10 && runs_a<runs_b){
            Toast.makeText(MainActivity.this,"Team A lost",Toast.LENGTH_SHORT).show();
        }
    }

    /*Display the runs scored by team B*/

    public void displayRunsForTeamB(int score){
        TextView scoreView=findViewById(R.id.runs_b);
        scoreView.setText(String.valueOf(score));
    }
    /*Display the wickets lost by team B*/

    public void displayWicketsForTeamB(int wicket){
        TextView wicketView=findViewById(R.id.wickets_b);
        wicketView.setText(String.valueOf(wicket));
    }

    /*Function to add a run when Dot or Wide*/

    public void addOneRunToB(View view){
        runs_b += 1;
        displayRunsForTeamB(runs_b);
    }

    /*Function to add 2 runs when 2 is clicked*/

    public void addTwoRunsToB(View view){
        runs_b += 2;
        displayRunsForTeamB(runs_b);
    }

    /*Function to add 4 runs when 4 is clicked*/

    public void addFourRunsToB(View view){
        runs_b += 4;
        displayRunsForTeamB(runs_b);
    }

    /*Function to add 6 runs when 6 is clicked*/

    public void addSixRunsToB(View view){
        runs_b += 6;
        displayRunsForTeamB(runs_b);
    }

    /*Function to Update Wicket*/

    public void wicketToB(View view)
    {
        switch (wickets_b)
        {
            case 0:
                wickets_b++;
                displayWicketsForTeamB(wickets_b);
                Toast.makeText(MainActivity.this,"9 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 1:
                wickets_b++;
                displayWicketsForTeamB(wickets_b);
                Toast.makeText(MainActivity.this,"8 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 2:
                wickets_b++;
                displayWicketsForTeamB(wickets_b);
                Toast.makeText(MainActivity.this,"7 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 3:
                wickets_b++;
                displayWicketsForTeamB(wickets_b);
                Toast.makeText(MainActivity.this,"6 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 4:
                wickets_b++;
                displayWicketsForTeamB(wickets_b);
                Toast.makeText(MainActivity.this,"5 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 5:
                wickets_b++;
                displayWicketsForTeamB(wickets_b);
                Toast.makeText(MainActivity.this,"4 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 6:
                wickets_b++;
                displayWicketsForTeamB(wickets_b);
                Toast.makeText(MainActivity.this,"3 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 7:
                wickets_b++;
                displayWicketsForTeamB(wickets_b);
                Toast.makeText(MainActivity.this,"2 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 8:
                wickets_b++;
                displayWicketsForTeamB(wickets_b);
                Toast.makeText(MainActivity.this,"1 Wickets to Go",Toast.LENGTH_SHORT).show();
                break;

            case 9:
                wickets_b++;
                displayWicketsForTeamB(wickets_b);
                break;
        }
        if(wickets_b==10 && runs_b<runs_a){
            Toast.makeText(MainActivity.this,"Team B lost",Toast.LENGTH_SHORT).show();
        }
    }

    /* Reset Button*/
    public void reset(View view)
    {
        runs_a=0;
        runs_b=0;
        wickets_a=0;
        wickets_b=0;
        displayRunsForTeamA(runs_a);
        displayWicketsForTeamA(wickets_a);
        displayRunsForTeamB(runs_b);
        displayWicketsForTeamB(wickets_b);
    }
}
