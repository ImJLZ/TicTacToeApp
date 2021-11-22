package com.example.tictactoeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout gameboard;
    boolean p1Turn,p2Turn;
    boolean winnerFound;
    Button[][] buttons = new Button[3][3];
    Button btnReset, btnNewGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gameboard = findViewById(R.id.llBoard);

        createGameBoard();
    }

    private void createGameBoard() {
        for (int r = 0;  r < 3; r++){
            LinearLayout ll = new LinearLayout(MainActivity.this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    0,
                    1
            );
            ll.setLayoutParams(params);
            for(int c = 0; c < 3; c++){
                buttons[r][c] = createButton();
                buttons[r][c].setOnClickListener(this);
                ll.addView(buttons[r][c]);
            }
            gameboard.addView(ll);
        }
    }

    private Button createButton() {
        Button btn = new Button(MainActivity.this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.MATCH_PARENT,
                1
        );
        btn.setLayoutParams(params);
        return btn;
    }

    @Override
    public void onClick(View v) {

    }
}