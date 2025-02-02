package Board;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameActionListener implements ActionListener {

    private BoardTile selected;
    private Color turn;

    public GameActionListener(){
        turn = Color.WHITE;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
          BoardTile clicked = (BoardTile) e.getSource();

          if(selected == null) {
              if(clicked.getCurrentPiece() == null)
                  return;
              if(clicked.getCurrentPiece().getTeam() != whoseTurn())
                  return;


              selected = clicked;
          }
          else {
              if(selected == clicked){
                  selected = null;
              }
              else{
                  if(selected.getCurrentPiece().move(clicked)){
                      selected = null;
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
