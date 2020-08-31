import java.awt.*;
import java.util.*;

public class Desert extends Cell{
    public Desert(int x,int y){
        super(x, y);
        Random rand = new Random();
        visc = rand.nextInt(210);
        this.color = new Color(250,250, visc);
        }
    }
