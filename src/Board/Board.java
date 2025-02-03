package Board;

import Board.Pieces.ChessPiece;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JFrame {

    private final BoardTile[][] boardTiles = new BoardTile[8][8];
    private final GameActionListener listener = new GameActionListener(this);
    private final JPanel panel = new JPanel(new GridLayout(8,8));
    private final ArrayList<ChessPiece> chessPieces = new ArrayList<>(32);
    private BoardTile selected;
    private Color turn;

    public Board(){
        super("Chess");

        this.add(this.panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("resources/babana.png").getImage());
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.boardInit();
        this.setVisible(true);
    }

    public void boardInit(){
        for(int y = 0; y < 8; y++ ){
            boolean whiteFirst = (y % 2 == 0);
            for(int x = 0; x < 8 ; x++){
                 if(whiteFirst){
                     boardTiles[y][x] = new BoardTile(Color.WHITE, this, x, y);
                     boardTiles[y][x].addActionListener(this.listener);
                     boardTiles[y][x].setText(+y +" " +x);
                     panel.add(boardTiles[y][x]);
                     whiteFirst = false;
                 }
                 else{
                     boardTiles[y][x] = new BoardTile(Color.BLACK, this, x, y);
                     boardTiles[y][x].addActionListener(this.listener);
                     boardTiles[y][x].setText(+y +" " +x);
                     panel.add(boardTiles[y][x]);
                     whiteFirst = true;
                 }
            }
        }
        pieceInit();
    }
    public void pieceInit(){

    }
    public void gameTurn(BoardTile clicked){
        if(selected == null) {
            if(clicked.getCurrentPiece() == null)
                return;
            if(clicked.getCurrentPiece().getTeam() != whoseTurn())
                return;

            selected = clicked;
            highlightTiles(selected.getCurrentPiece());
        }
        else {
            if(selected == clicked){
                dehighlightTiles(selected.getCurrentPiece());
                selected = null;
            }
            else{
                if(selected.getCurrentPiece().move(clicked)){
                    dehighlightTiles(selected.getCurrentPiece());
                    selected = null;
                    swapTurn();
                }
            }
        }
    }
    public boolean checkMateCond(){
        return true;
    }
    public void highlightTiles(ChessPiece piece){
        piece.getPossibleMoves().forEach(x -> x.setBackground(Color.GREEN));
    }
    public void dehighlightTiles(ChessPiece piece){
        piece.getPossibleMoves().forEach(x -> x.resetColor());
    }
    public Color whoseTurn(){
        return turn;
    }
    public void swapTurn(){
        if(whoseTurn() == Color.WHITE){
            turn = Color.BLACK;
        }
        else{
            turn = Color.WHITE;
        }
    }

}

