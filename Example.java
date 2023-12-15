import java.awt.*;
;
public class Example {
    Frame f;
    TextField t;
    Button b;
    public Example(){
        f=new Frame();
        f.setTitle("first");
        f.setSize(500,400);
        t= new TextField("hello");
        t.setBounds(200,150,100,40);
        b= new Button("ok");
        b.setBounds(230,250,70,50);
        f.add(b);
        f.add(t);
        f.setLayout(null);
        f.setVisible(true);


    }
    public  static void main(String[]args){
        new Example();

    }
    
}
