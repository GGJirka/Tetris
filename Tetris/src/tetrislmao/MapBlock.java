/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetrislmao;

/**
 *
 * @author ggjimmy
 */
public class MapBlock {
    private Block[][] map;
    
    //width and height, change for different board size
    private int width=10,height=20;
    
    public MapBlock(){
        map = new Block[width][height];
    }
    
    //initialize map 
    public void init(){
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                
            }
        }
    }
    
    public Block[][] getBlocks(){
        return this.map;
    }
    
    public void addBlock(int row, int column){
        this.map[row][column] = new Block(row,column);
    }
}
