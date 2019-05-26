package com.davegreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame implements ActionListener
{
    private JFrame frame;
    private MyJPanel myJPanel;
    
    public MyJFrame()
    {
        this.frame = new JFrame();
        this.myJPanel = new MyJPanel();
    }
    
    public void runFrame()
    {
        JTextField myTextField = myJPanel.getTextField();           // This is an action listener for the text field, that prints out "Do Something" each time i hit the return
        myTextField.addActionListener(this);                        // key while the cursor is in the text field itself.
        
        myJPanel.add(myJPanel.getTextField());
        myJPanel.add(myJPanel.getLabel());
    
        //myJPanel.getTextField().setText("");                        // Here i have cleared the text field with he use of blank quotes, as can be see the resetting of
                                                                    // the text can be done from wherever there has been an instance of MyJPanel object.
        
        //myJPanel.getTextField().selectAll();                        // Here we use the selectAll() to highlight the text within the text field.
        
        //myJPanel.getTextField().requestFocus();                   // The requestFocus() method puts the cursor back in the text field (so the user can just start typing).
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(myJPanel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Do Something.");
    }
}
