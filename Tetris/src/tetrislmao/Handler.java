/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetrislmao;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Handler{
    private MapBlock map;
    
    public Handler(MapBlock map){
       this.map = map;
       map.addBlock(5,0);
    }
    
    
    public void render(Graphics g){
        Block[][] blocks = map.getBlocks();
        
        for(int i=0;i<blocks.length;i++){
            for(int j=0;j<blocks[0].length;j++){
                if(blocks[i][j] != null){
                    blocks[i][j].render(g);
                    blocks[i][j].action();
                }
            }
        }
    }
}
