import java.awt.*;
class Evhnd3 extends Frame{
    Button b1,b2,b3,b4,b5;
    Evhnd3(){
    setLayout(null);
    b1= new Button("1");
    b2= new Button("2");
    b3= new Button("3");
    b4= new Button("5");
    b5= new Button("5");
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    b1.setBounds(100,70,80,30);
    b2.setBounds(190,70,80,30);
    b3.setBounds(280,70,80,30);
    b4.setBounds(150,110,80,30);
    b5.setBounds(240,110,80,30);
    }
    public static void main(String[] args){
        Evhnd3 m = new Evhnd3();
        m.setSize(900,300);
        m.setVisible(true);
    }
}


//awt program for five buttons
//setBounds(x,y,w,h)