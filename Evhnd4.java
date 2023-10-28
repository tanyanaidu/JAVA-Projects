import java.awt.*;
class Evhnd4 extends Frame{
    Button b1,b2;
    Evhnd4(){
    b1= new Button("OK");
    b2= new Button("Cancel");
    add(b1);
    add(b2);
    GridLayout g = new GridLayout(1,2);
    setLayout(g);
    }
    public static void main(String[] args){
        Evhnd4 m = new Evhnd4();
        m.setSize(1000,70);
        m.setVisible(true);
    }
}



//awt program for ok and cancel