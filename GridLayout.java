import java.awt.*;


public class GridLayout extends Frame{
    public GridLayout(){
        Button[] bth=new Button[6];
        for(int i=0;i<bth.length;i++){
            bth[i]=new Button(""+(i+1));
            add(bth[i]);
        }
        setSize(400,400);
        setLayout(new java.awt.GridLayout(3,3));
        setVisible(true);
    }

public  static void main(String[]args){
    new GridLayout();

}
    
}
