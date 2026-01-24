import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame implements ActionListener{

    JButton enter;

    public Frame(){
        super("First interface");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        enter=new JButton("Initiate");
        enter.addActionListener(this);

        JPanel actions = new JPanel(new GridLayout(6, 1));
        actions.add(enter);

        add(actions,BorderLayout.CENTER);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() instanceof JButton){
            JButton action = (JButton) e.getSource();
            String textButton = action.getText();
            if(textButton == "Initiate"){
                System.out.println("Working on it");
            }
        }

    }

}