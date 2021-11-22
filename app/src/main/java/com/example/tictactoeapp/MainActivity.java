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
    String test;
    String test2;
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
                test = "";
                test = ""+r+c;
                buttons[r][c].setId(Integer.parseInt(test));//todo how what y id? i cant seem to find it is lost to the void monster

                buttons[r][c].setOnClickListener(this);
                ll.addView(buttons[r][c]);
            }
            gameboard.addView(ll);
        }
    }

    private int winCheck() {
//pseudo kode
//        if (btn[0][0] != "" && btn[0][0] == 1 && btn[0][1] == 1 && btn[0][2] == 1){ // et check af om den øverste linje er af en spiller modhage ved dette er dog der kommer mange if else kan forkortes ved at itterere igennm loop istedet
//            return btn[0][0];
//        }
//        else if (btn[0][0] != "" && btn[0][0] == "2" && btn[0][1] == "2" && btn[0][2] == "2"){
//            return btn[0][0];
//        }
        return 0;
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
        // todo find hvilken button blev trykket
        int test = 0;
        if (winCheck() != 0){
            winnerFound = true;
            //do win stuff
        }
    }
}