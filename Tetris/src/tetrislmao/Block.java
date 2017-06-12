
package tetrislmao;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Block {
    private int x,y;
    
    public Block(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void action(){
       //y=400;
    }
    
    public void render(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(x*32,y*32,32,32);
        if(y<50){
        y++;
        }
    }   
    
}
