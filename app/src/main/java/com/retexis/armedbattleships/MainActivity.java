package com.retexis.armedbattleships;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.retexis.armedbattleships.Managers.PlaceShipsManager;
import com.retexis.armedbattleships.Models.Board;
import com.retexis.armedbattleships.Models.Ships;

public class MainActivity extends AppCompatActivity {

    Board board;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        board = findViewById(R.id.board);

        PlaceShipsManager.shipsToDefaultPlace(board, new Ships(this));

    }
}
