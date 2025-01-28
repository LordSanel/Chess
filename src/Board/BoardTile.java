package Board;

import Board.Pieces.ChessPiece;

import javax.swing.*;
import java.awt.*;

public class BoardTile extends JButton {
    private ChessPiece currentPiece;

    public BoardTile(Color color){
        super();
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
          setIcon(getCurrentPiece().getIcon());
    }
    public void removePiece(ChessPiece piece){
          setCurrentPiece(null);
          setIcon(null);
    }

}
