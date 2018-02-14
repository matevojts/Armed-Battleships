package com.retexis.armedbattleships.Managers;

import android.content.Context;
import android.widget.Toast;

import com.retexis.armedbattleships.Models.Field;
import com.retexis.armedbattleships.Models.Ship;
import com.retexis.armedbattleships.Models.Ships;

/**
 * Created by matev on 2018. 02. 14..
 */

public class ShootingManager {

    public static void shoot(Context context, Field field, Ships ships) {
        int fieldShipID = field.getShipID();


        if (!field.hasHit()) {
            if (fieldShipID != 0) {
                for (int i = 1; i <= ships.getShips().size(); i++){
                    Ship actualShip = ships.getShips().get(i);

                    if (actualShip.getId() == fieldShipID) {
                        actualShip.decrementHealth();
                    }

                }
                field.getFieldTextView().setText("O");
                field.setHasHit(true);
            } else {
                field.getFieldTextView().setText("X");
                field.setHasHit(true);
            }
        } else {
            Toast.makeText(context, "Field has hit already.", Toast.LENGTH_SHORT).show();
        }
    }
}
