package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        MyJFrame myJFrame = new MyJFrame();
        //myJFrame.runFrame();
        
        MyJPanel myJPanel = new MyJPanel();
        myJPanel.getTextField().setText("new text");                    // Here i can set some new text
        //System.out.println(myJPanel.getTextField().getText());
    
        myJFrame.runFrame();
    }
}