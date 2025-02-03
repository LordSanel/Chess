package Board;

import Board.Pieces.ChessPiece;

import javax.swing.*;
import java.awt.*;

public class BoardTile extends JButton {
    private Board board;
    private ChessPiece currentPiece;
    private Color color;
    private int xPos;
    private int yPos;

    public BoardTile(Color color, Board board, int xPos, int yPos){
        super();
        this.board = board;
        this.currentPiece = null;
        this.xPos = xPos;
        this.yPos= yPos;
        this.color = color;
        this.setBackground(color);
        this.setBorderPainted(false);
        this.setFocusPainted(false);
        this.setFont(new Font("Serif",Font.PLAIN, 35));
    }

    public void setCurrentPiece(ChessPiece currentPiece) {
        this.currentPiece = currentPiece;
    }

    public ChessPiece getCurrentPiece() {
        return currentPiece;
    }
    public int getXPos(){
        return xPos;
    }
    public int getYPos(){
        return yPos;
    }

    public void attachPiece(ChessPiece piece){
          if(currentPiece!= null){
              board.removePiece(currentPiece);
          }
          setCurrentPiece(piece);
          setText(piece.getType().getIcon());
    }
    public void detachPiece(ChessPiece piece){
          setCurrentPiece(null);
          setText("");
    }
    public void resetColor(){
        this.setBackground(color);
    }

}
