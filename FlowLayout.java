import java.awt.*;

public class FlowLayout extends Frame{
    public FlowLayout(){
        Button[] bth=new Button[3];
        for(int i=0;i<bth.length;i++){
            bth[i]=new Button(""+(i+1));
            add(bth[i]);
        }
        setSize(400,400);
        setLayout(new java.awt.FlowLayout(ABORT));
        setVisible(true);
    }
    public  static void main(String[]args){
        new FlowLayout();
    
    }
}
