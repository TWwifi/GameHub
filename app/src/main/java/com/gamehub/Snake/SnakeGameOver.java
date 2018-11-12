package com.gamehub.Snake;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.TextView;

import com.gamehub.R;

public class SnakeGameOver extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snake_gameover);

        TextView scoreLabel = (TextView) findViewById(R.id.scoreLabel);

        int endScore = getIntent().getIntExtra("Score: ", 0);
        scoreLabel.setText(endScore + "");
    }

    public void newGame(View view){
        finish();
        startActivity(new Intent(getApplicationContext(),SnakeActivity.class));
    }

    public void exit(View view){
        finish();
    }
}
