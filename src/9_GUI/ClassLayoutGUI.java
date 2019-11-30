/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classguimanajemenlayout;

/**
 *
 * @author Agata
 */
import javax.swing.JFrame;

public class ClassLayoutGUI {
    public static void main(String[] args) {
        JFrame frame = new ClassBorder();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JFrame frame2 = new ClassGrid();
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
        
        JFrame frame3 = new ClassBox();
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setVisible(true);
    }
}
