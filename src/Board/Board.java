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
        for(int x = 0; x < 8; x++ ){
            boolean blackFirst = (x % 2 == 0);
            for(int y = 0; y < 8 ; y++){
                 if(blackFirst){
                     boardTiles[x][y] = new BoardTile(Color.BLACK);
                     panel.add(boardTiles[x][y]);
                     blackFirst = false;
                 }
                 else{
                     boardTiles[x][y] = new BoardTile(Color.WHITE);
                     panel.add(boardTiles[x][y]);
                     blackFirst = true;
                 }
            }
        }
    }

}
