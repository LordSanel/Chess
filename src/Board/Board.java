package Board;

import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {

    private final BoardTile[][] boardTiles = new BoardTile[8][8];
    private final GameActionListener listener = new GameActionListener();
    private final JPanel panel = new JPanel(new GridLayout(8,8));

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
                     boardTiles[y][x] = new BoardTile(Color.WHITE, this);
                     boardTiles[y][x].addActionListener(this.listener);
                     boardTiles[y][x].setText(+y +" " +x);
                     panel.add(boardTiles[y][x]);
                     whiteFirst = false;
                 }
                 else{
                     boardTiles[y][x] = new BoardTile(Color.BLACK, this);
                     boardTiles[y][x].addActionListener(this.listener);
                     boardTiles[y][x].setText(+y +" " +x);
                     panel.add(boardTiles[y][x]);
                     whiteFirst = true;
                 }
            }
        }
    }

}

