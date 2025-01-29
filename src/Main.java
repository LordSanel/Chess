import Board.Board;
import Board.BoardTile;
import com.formdev.flatlaf.FlatIntelliJLaf;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       try {
           UIManager.setLookAndFeel(new FlatIntelliJLaf());
       } catch(Exception ex){
            ex.printStackTrace();
       }

        Board chessBoard = new Board();
        chessBoard.setIconImage(new ImageIcon("./resources/babana.png").getImage());
        JPanel boardPanel =  new JPanel(new GridLayout(8,8));
        chessBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chessBoard.setSize(500,500);
        chessBoard.setLocationRelativeTo(null);
        chessBoard.boardInit(boardPanel);
        chessBoard.setVisible(true);
        chessBoard.game();

    }
}