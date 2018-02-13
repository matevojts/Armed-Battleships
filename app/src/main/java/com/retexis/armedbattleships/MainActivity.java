package com.retexis.armedbattleships;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.retexis.armedbattleships.Models.Board;

public class MainActivity extends AppCompatActivity {

    Board board;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        board = findViewById(R.id.board);

    }
}
