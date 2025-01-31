package Board;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameActionListener implements ActionListener {

    private BoardTile firstClick;
    private Color turn;

    public GameActionListener(){
        turn = Color.WHITE;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
          BoardTile clicked = (BoardTile) e.getSource();

          if(firstClick == null) {
              if((clicked.getCurrentPiece() != null) && clicked.getCurrentPiece().getTeam() == whoseTurn()){
                  firstClick = clicked;
              }
          }
          else {
              if(firstClick == clicked){
                  firstClick = null;
              }
              else{
                  if(firstClick.getCurrentPiece().move(clicked)){
                      firstClick = null;
                      swapTurn();
                  }
              }
          }

    }

    public Color whoseTurn(){
        return turn;
    }
    public void swapTurn(){
        if(whoseTurn() == Color.WHITE){
            turn = Color.BLACK;
        }
        else{
            turn = Color.WHITE;
        }
    }

}
