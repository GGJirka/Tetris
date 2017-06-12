/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetrislmao;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author ggjimmy
 */
public class Frame {
    
    public Frame(Tetrislmao tetris){
        JFrame frame = new JFrame();
        frame.setTitle("tetris");
        frame.setSize(640,640);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.add(tetris);
        tetris.thread();
    }
}
