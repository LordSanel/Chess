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
        JPanel mainPanel = new JPanel(new GridLayout());
        chessBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chessBoard.setSize(500,500);
        chessBoard.setLocationRelativeTo(null);
        chessBoard.boardInit(mainPanel);
        chessBoard.setVisible(true);

    }
}