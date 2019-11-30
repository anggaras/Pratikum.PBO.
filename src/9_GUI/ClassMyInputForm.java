/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classgui;

/**
 *
 * @author Agata
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ClassMyInputForm extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;      
    private JLabel cLabel;      
    private JTextField aField;     
    private JTextField bField;     
    private JButton button;
    private JPanel panel; 

    public ClassMyInputForm() {
        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextField() {
        aLabel = new JLabel ("Nilai A: ");
        bLabel = new JLabel ("Nilai B: ");
        cLabel = new JLabel ("Hasil: ");

    final int FIELD_WIDTH = 10;
       aField = new JTextField(FIELD_WIDTH);
       aField.setText("0");
       bField = new JTextField(FIELD_WIDTH);
       bField.setText("0");        
    }
    
    private void createButton(){
        button = new JButton("Calculate");
        class AddInteresListener implements ActionListener{
           
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a * b ;
                cLabel.setText("Hasil: " + c);
                
                ActionListener listener = new AddInteresListener();
                button.addActionListener(listener);
            }
        }
    }
    
    private void createPanel(){
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(cLabel);
        add(panel);
    }

    public static void main(String[] args) {
        JFrame frame = new ClassMyInputForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    
}
