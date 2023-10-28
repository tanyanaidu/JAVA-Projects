import java.awt.*;
class Evhnd2 extends Frame{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
    Evhnd2(){
        l1= new Label("Roll no.");
        l2= new Label("Name");
        l3= new Label("Marks");
        t1= new TextField();
        t2= new TextField();
        t3= new TextField();
        b1= new Button("OK");
        b2= new Button("Cancel");
        GridLayout g = new GridLayout(1,2);
        setLayout(g);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(t3);
        add(l3);
        add(b1);
        add(b2);
    }
    public static void main(String[] args){
        Evhnd2 m = new Evhnd2();
        m.setSize(1000,300);
        m.setVisible(true);
    }
}