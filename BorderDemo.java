import java.awt.*;
;
public class BorderDemo {
    public BorderDemo(){
    Frame f= new Frame();
    f.setSize(400,400);
    Button north= new Button("NORTH");
     Button south= new Button("SOUTH");
     Button east= new Button("EAST");
     Button west= new Button("WEST");
     Button center= new Button("CENTER");
     f.add(north,BorderLayout.NORTH);
     f.add(south,BorderLayout.SOUTH);
     f.add(east,BorderLayout.EAST);
     f.add(west,BorderLayout.WEST);
     f.add(center);
     f.setVisible(true);
    //  f.setLayout(new BorderLayout(250,250));
    }



public  static void main(String[]args){
    new BorderDemo();

}

    
}
