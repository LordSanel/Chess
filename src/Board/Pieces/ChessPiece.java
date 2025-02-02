package Board.Pieces;


import Board.BoardTile;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

abstract public class ChessPiece {
    private Color team;
    private String icon;
    private BoardTile currentTile;
    private List<BoardTile> possibleMoves;

    public Color getTeam(){
        return this.team;
    }
    public void setTeam(Color team) {
        this.team = team;
    }
    public String getIcon(){
        return this.icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public BoardTile getCurrentTile(){
        return currentTile;
    }
    public void setCurrentTile(BoardTile newTile){
        currentTile = newTile;
    }

    public boolean move(BoardTile moveTo){
        if(getPossibleMoves().contains(moveTo)){
            moveTo.attachPiece(this);
            currentTile.removePiece(this);
            setCurrentTile(moveTo);
            generatePossibleMoves();
            return true;
        }
        return false;
    }
    public abstract void generatePossibleMoves();
    public List<BoardTile> getPossibleMoves(){
        return this.possibleMoves;
    }
}
