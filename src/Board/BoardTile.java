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

    public void setBoard(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public void setCurrentPiece(ChessPiece currentPiece) {
        this.currentPiece = currentPiece;
    }

    public ChessPiece getCurrentPiece() {
        return currentPiece;
    }

    public void attachPiece(ChessPiece piece){
          setCurrentPiece(piece);
          setIcon(getCurrentPiece().getIcon());
    }
    public void removePiece(ChessPiece piece){
          setCurrentPiece(null);
          setIcon(null);
    }

}
