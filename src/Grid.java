import java.awt.*;
import java.util.*;

class Grid {
    //fields
    Cell[][] cells = new Cell[20][20];
    Cell Desert;
    Cell Wall;

    // constructor
    public Grid(){
        Random random = new Random();
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells.length; j++){
                int celltype = random.nextInt(100);
                    if(celltype < 70){                
                        cells[i][j] = new Desert (10 + 35*i, 10 + 35*j);
                    } else {
                        cells[i][j] = new Wall (10 + 35*i, 10 + 35*j);
                    }
                }
            }
        }
    

    // methods
    public void paint(Graphics g, Point mousePos){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells.length; j++){
                cells[i][j].paint(g, mousePos);
                cells[i][j].col();
            }
        }
    }

    public Cell cellAtColRow(int c, int r){
        return cells[c][r];
    }

}