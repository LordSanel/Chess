package Board;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Board extends JFrame {

    private boolean whiteTurn;
    private BoardTile firstClick;
    private BoardTile secondClick;
    private BoardTile[][] boardTiles;

    public boolean isWhiteTurn() {
        return whiteTurn;
    }
    public void swapTurn(){
        whiteTurn = !whiteTurn;
    }

    public Board(){
        super("Chess");
        this.whiteTurn = true;
        this.boardTiles = new BoardTile[8][8];
    }


    public void boardInit(JPanel panel){
        this.add(panel);
        for(int y = 0; y < 8; y++ ){
            boolean whiteFirst = (y % 2 == 0);
            for(int x = 0; x < 8 ; x++){
                 if(whiteFirst){
                     boardTiles[y][x] = new BoardTile(Color.WHITE);
                     boardTiles[y][x].setText(+y +" " +x);
                     panel.add(boardTiles[y][x]);
                     whiteFirst = false;
                 }
                 else{
                     boardTiles[y][x] = new BoardTile(Color.BLACK);
                     boardTiles[y][x].setText(+y +" " +x);
                     panel.add(boardTiles[y][x]);
                     whiteFirst = true;
                 }
            }
        }
    }

    public void game(){
        boolean gameContinue = false;
        String winner =  null;
        while(gameContinue){

        }
        System.out.println("The Winner is: ");
    }

}
