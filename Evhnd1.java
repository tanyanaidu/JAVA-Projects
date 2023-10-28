import java.awt.*;
class Evhnd1 extends Frame{
    Checkbox c1,c2,c3,c4;
    Button b1;
    Evhnd1(){
        c1= new Checkbox("C++");
        c2= new Checkbox("C");
        c3= new Checkbox("JAva");
        c4= new Checkbox("Python");
        b1= new Button("OK");
        GridLayout g = new GridLayout(1,2);
        setLayout(g);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(b1);
    }
    public static void main(String[] args){
        Evhnd1 m = new Evhnd1();
        m.setSize(100,30);
        m.setSize(1000,300);
        m.setVisible(true);
    }
}

//checkbox c c++ java and marks