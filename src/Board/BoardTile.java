package Board;

import Board.Pieces.ChessPiece;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardTile extends JButton {
    private Board board;
    private ChessPiece currentPiece;
    private Color color;
    private int x;
    private int y;

    public BoardTile(Color color, Board board,int x, int y){
        super();
        this.board = board;
        this.currentPiece = null;
        this.x = x;
        this.y= y;
        this.color = color;
        this.setBackground(color);
        this.setFont(new Font("Serif",Font.PLAIN, 35));
    }

    public void setCurrentPiece(ChessPiece currentPiece) {
        this.currentPiece = currentPiece;
    }

    public ChessPiece getCurrentPiece() {
        return currentPiece;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void attachPiece(ChessPiece piece){
          if(currentPiece!= null){

          }
          setCurrentPiece(piece);
          setText(piece.getType().getIcon());
    }
    public void removePiece(ChessPiece piece){
          setCurrentPiece(null);
          setText("");
    }

}
