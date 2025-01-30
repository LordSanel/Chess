package Board.Pieces;


import Board.BoardTile;

import javax.swing.*;
import java.awt.*;

abstract public class ChessPiece {
    private Color team;
    private ImageIcon icon;
    private BoardTile currentTile;

    public Color getTeam(){
        return this.team;
    }
    public void setTeam(Color team) {
        this.team = team;
    }
    public ImageIcon getIcon() {
        return icon;
    }
    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
    public BoardTile getCurrentTile(){
        return currentTile;
    }
    public void setCurrentTile(BoardTile newTile){
        currentTile = newTile;
    }

    public void move(BoardTile moveTo){
        if(checkRule(moveTo)){
            moveTo.attachPiece(this);
            currentTile.removePiece(this);
            setCurrentTile(moveTo);
        }
    }
    public abstract boolean checkRule(BoardTile moveTo);


}
