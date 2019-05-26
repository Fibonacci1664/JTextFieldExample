package com.davegreen;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel
{
    private JLabel label;
    private JTextField textField;
    
    public MyJPanel()
    {
        this.textField = new JTextField("Please enter text here", 20);
        this.label = new JLabel("Hello");
    }
    
    public JTextField setNewText()
    {
        return textField;
    }
    
    public void runClearField()
    {
        textField.setText("");
    }
    
    public JLabel getLabel()
    {
        return label;
    }
    
    public void setLabel(JLabel label)
    {
        this.label = label;
    }
    
    public JTextField getTextField()
    {
        return textField;
    }
    
    public void setTextField(JTextField textField)
    {
        this.textField = textField;
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(Color.red);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        
        g.setColor(Color.yellow);
        g.fillOval(150, 150, 100, 100);
    }
}
