import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;
public class MultipleButton extends JFrame implements ActionListener{
    JButton red,blue,green;
    public MultipleButton(){
        setSize(400,500);
        red=new JButton("RED");
        blue= new JButton("BLUE");
        green= new JButton("GREEN");
        add(red);
        add(blue);
        add(green);
       setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        red.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==red){
            getContentPane().setBackground(Color.red);
        }
        else if(e.getSource()==blue){
            getContentPane().setBackground(Color.blue);
        }
        else{
            getContentPane().setBackground(Color.green);
        }

}


 

public static void main(String[]args){
    new MultipleButton();
}

}
