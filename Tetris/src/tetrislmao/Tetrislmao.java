package tetrislmao;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;


public class Tetrislmao extends Canvas implements Runnable{
    
    private Handler handler;
    private MapBlock map;
    
    public static void main(String[] args) {
        Frame frame = new Frame(new Tetrislmao());
    }
    
    public void thread(){
       Thread thread = new Thread(this);
       map = new MapBlock();
       map.init();
       handler = new Handler(map);
       thread.start();
       
    }
    
    @Override
    public void run() {
        while(true){
            render();
        }
    }
    
    public void render(){
        BufferStrategy bf = this.getBufferStrategy();
        
        if (bf==null){
            this.createBufferStrategy(3);
            return;
        }
        
        Graphics g = bf.getDrawGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.BLACK);
        handler.render(g);
        g.dispose();
        bf.show();
    }

}
