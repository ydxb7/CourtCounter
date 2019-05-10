package ai.tomorrow.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add_3_points_teamA(View view){
        scoreTeamA += 3;
        System.out.println(scoreTeamA);
        displayForTeamA(scoreTeamA);
    }

    public void add_2_points_teamA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void add_1_point_teamA(View view){
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add_3_points_teamB(View view){
        scoreTeamB += 3;
        System.out.println(scoreTeamB);
        displayForTeamB(scoreTeamB);
    }

    public void add_2_points_teamB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void add_1_point_teamB(View view){
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
