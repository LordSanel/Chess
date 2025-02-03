package Board;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameActionListener implements ActionListener {

    private Board board;

    public GameActionListener(Board board){
        this.board = board;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
          board.gameTurn((BoardTile) e.getSource());
    }

}
