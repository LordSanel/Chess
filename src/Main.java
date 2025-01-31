import Board.Board;
import Board.BoardTile;
import com.formdev.flatlaf.FlatIntelliJLaf;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
       try {
           UIManager.setLookAndFeel(new FlatIntelliJLaf());
       } catch(Exception ex){
            ex.printStackTrace();
       }

        Board chessBoard = new Board();

        //chessBoard.setSize(500,500);
        //chessBoard.setLocationRelativeTo(null);
        //chessBoard.boardInit();
        //chessBoard.setVisible(true);
        //chessBoard.game();

    }
}