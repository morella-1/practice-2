package gui;

import javax.swing.*;

public class MyFrame extends JFrame {


    public MyFrame(){
        this.setBounds(200,200,300,400);

        this.setVisible(true);
    }
       public MyFrame(String s){
        super(s);
        this.setBounds(200,200,300,400);
        this.setVisible(true);
       }

}
