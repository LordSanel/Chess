package Board;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.WHITE;

public class GameActionListener implements ActionListener {

    private Board board;
    private String winner;

    public GameActionListener(Board board){
        this.board = board;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
          if(board.isGameOver()){
              System.out.println("Checkmate! The Winner is: " +winner);
              return;
          }
          board.gameTurn((BoardTile) e.getSource());
    }
    public void setWinner(Color color){
        if (color == WHITE)
            winner = "White!";
        else
            winner = "Black!";
    }

}
