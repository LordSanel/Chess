package Board.Pieces;


import Board.BoardTile;
import Board.TeamColor;

import javax.swing.*;

abstract public class ChessPiece {
    private TeamColor team;
    private ImageIcon icon;
    private BoardTile currentTile;

    public TeamColor getTeam(){
        return team;
    }
    public void setTeam(TeamColor team){
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
