package com.retexis.armedbattleships.Managers;

import com.retexis.armedbattleships.Models.Board;
import com.retexis.armedbattleships.Models.Field;
import com.retexis.armedbattleships.Models.Ships;

/**
 * Created by matev on 2018. 02. 14..
 */

public class PlaceShipsManager {


    public static void shipsToDefaultPlace(Board board, Ships ships) {

        for (int i = 0; i < ships.getShips().size(); i++) {

            for (int j = 0; j < ships.getShips().get(i).getSize(); j++) {

                Field actualField = board.getField(i, j);
                actualField.setShipID(ships.getShips().get(i).getId());
            }
        }
    }
}
