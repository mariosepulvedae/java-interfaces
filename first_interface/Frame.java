import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;

public class Frame extends JFrame implements ActionListener{

    JButton enter;
    JButton eliminar;
    JTextField day;
    JLabel context;
    public Graphics image;
    String fileName = "names.txt";
    public int age = 0;
    public ArrayList<String> diary = new ArrayList<String>();
    public Frame(){

        super("First interface");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        enter = new JButton("Initiate");
        enter.addActionListener(this);

        eliminar = new JButton("Eliminar");
        eliminar.addActionListener(this); 


        day = new JTextField();
        day.addActionListener(this);

        context = new JLabel();

        JPanel entrance = new JPanel(new GridLayout(10,3));
        entrance.add(day);
        entrance.add(context);


        JPanel actions = new JPanel(new GridLayout(10, 1));
        actions.add(enter);
        actions.add(eliminar);
 
        add(new JLabel("Select the acction"),BorderLayout.PAGE_END);
        add(actions,BorderLayout.EAST);
        add(entrance,BorderLayout.CENTER);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() instanceof JButton){
            JButton action = (JButton) e.getSource();
            String textButton = action.getText();
            if(textButton == "Initiate"){
                System.out.println("Working on it");
                try{
                    File open = new File(fileName);
                    if(open.exists()==false){
                        System.out.println("The file does not exist");
                    }
                }catch(Exception excep){
                    System.out.println(excep.getMessage());
                }
            }else if(textButton=="Eliminar"){
                Bivian.Hablar();
                System.out.println(day.getText());
                context.setText(day.getText());
                day.setText("");
            }
        }
    }
}