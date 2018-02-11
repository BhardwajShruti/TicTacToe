package com.example.android.tictactoe;

import android.content.Context;
import android.widget.Button;

/**
 * Created by shruti on 29-08-2017.
 */
public class CustomButton extends Button {
    int player;
    public CustomButton(Context context) {


        super(context);
        player=MainActivity.NO_PLAYER;
    }


    public void setPlayer(int player) {
        this.player = player;
        if(player == MainActivity.PLAYER_O){
            setText("O");
        }
        else if(player == MainActivity.PLAYER_X){
            setText("X");
        }
        else {
            setText("");
        }
    }

    public int getPlayer() {
        return player;
    }

    public boolean isEmpty(){
        return player == MainActivity.NO_PLAYER;
    }

}


