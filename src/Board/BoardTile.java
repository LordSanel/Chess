package Board;

import Board.Pieces.ChessPiece;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardTile extends JButton {
    private Board board;
    private ChessPiece currentPiece;

    public BoardTile(Color color, Board board){
        super();
        this.board = board;
        this.currentPiece = null;
        this.setBackground(color);
    }

    public void setCurrentPiece(ChessPiece currentPiece) {
        this.currentPiece = currentPiece;
    }

    public ChessPiece getCurrentPiece() {
        return currentPiece;
    }

    public void attachPiece(ChessPiece piece){
          setCurrentPiece(piece);
          setText(piece.getIcon());
    }
    public void removePiece(ChessPiece piece){
          setCurrentPiece(null);
          setText("");
    }

}
