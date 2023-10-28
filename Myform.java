import java.awt.*;
import java.awt.event.*;
class Myform extends Frame implements ActionListener{
    Checkbox c1,c2,c3,c4,c5,c6;
    Choice c7;
    CheckboxGroup cbg;
    Label l,l1,l2,l3,l4,l5,l6,l7;
    TextField t1,t2,t3,t4;
    Button b1,b2;

    Myform(){
        setLayout(null);
        c1= new Checkbox("Male",cbg,false);
        c2= new Checkbox("Female",cbg,false);
        cbg = new CheckboxGroup();
        c3= new Checkbox("C");
        c4= new Checkbox("C++");
        c5= new Checkbox("Java");
        c6= new Checkbox("Python");
        c7= new Choice();

        l= new Label("STUDENT DETAILS");
        l1= new Label("Name");
        l2= new Label("Roll no.");
        l3= new Label("Contact");
        l4= new Label("Course and specialization");
        l5= new Label("Gender");
        l6= new Label("Language");
        l7= new Label("Sem");
        t1= new TextField();
        t2= new TextField();
        t3= new TextField();
        t4= new TextField();

        b1= new Button("OK");
        b2= new Button("EXIT");
        b1.addActionListener(this);
        b2.addActionListener(this);

        l.setBounds(200,50,200,30);
        l1.setBounds(100,100,50,30);
        t1.setBounds(170,100,80,30);
        l2.setBounds(100,150,50,30);
        t2.setBounds(170,150,80,30);
        l3.setBounds(100,200,50,30);
        t3.setBounds(170,200,80,30);
        l4.setBounds(100,250,200,30);
        t4.setBounds(250,250,100,30);

        l5.setBounds(100,300,50,30);
        c1.setBounds(190,300,80,30);
        c2.setBounds(250,300,80,30);

        l6.setBounds(100,350,80,30);
        c3.setBounds(190,350,50,30);
        c4.setBounds(250,350,50,30);
        c5.setBounds(310,350,50,30);
        c6.setBounds(370,350,50,30);

        l7.setBounds(100,400,50,30);
        c7.setBounds(190,400,80,30);

        b1.setBounds(400,500,80,30);
        b2.setBounds(400,540,80,30);

        for (int i =1; i<=8; i++){
            c7.add(i+" ");
        }

        add(l);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(l7);
        add(l3);
        add(l4);
        add(c1);
        add(c2);
        add(l5);
        add(c3);
        add(c4);
        add(c5);
        add(c6);
        add(b1);
        add(b2);
        add(c7);
        add(l6);
    }
    public static void main(String[] args){
        Myform m = new Myform();
        m.setSize(700,700);
        m.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b1){
             
        }
        if (e.getSource()==b2){
            System.exit(0);             
        }
    }

}



//awt program for five buttons
//setBounds(x,y,w,h)