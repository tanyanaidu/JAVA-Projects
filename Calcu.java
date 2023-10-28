import java.awt.*;
import java.awt.event.*;
class Calcu extends Frame implements ActionListener{
    Label l1,l2,l3;
    TextField t1,t2;
    Button b1,b2,b3,b4,b5;
    Calcu(){
        setLayout(null);
        l1= new Label("Num 1");
        t1= new TextField();
        l2= new Label("Num 2");
        t2= new TextField();
        l3= new Label("Answer");
        b1= new Button("+");
        b2= new Button("-");
        b3= new Button("*");
        b4= new Button("/");
        b5= new Button("EXIT");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        l1.setBounds(80,70,50,30);
        t1.setBounds(140,70,60,30);
        l2.setBounds(80,130,50,30);
        t2.setBounds(140,130,60,30);
        l3.setBounds(85,350,80,30);
        b1.setBounds(50,200,80,30);
        b2.setBounds(140,200,80,30);
        b3.setBounds(50,250,80,30);
        b4.setBounds(140,250,80,30);
        b5.setBounds(85,300,80,30);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    }

    public void actionPerformed(ActionEvent e){ 
        String x = t1.getText();
        int a = Integer.parseInt(x);
        String y = t2.getText();
        int b = Integer.parseInt(y);
        if(e.getSource()==b1){
            l3.setText(a +" + "+b +" = "+(a+b)+"");
        }
        if(e.getSource()==b2){
            l3.setText(a +" - "+b+" = "+(a-b)+"");
        }
        if(e.getSource()==b3){
            l3.setText(a +" * "+b +" = "+(a*b)+"");
        }
        if(e.getSource()==b4){
            l3.setText(a +" / "+b +" = "+(a/b)+"");
        }
        if(e.getSource()==b5){
            System.exit(0);
        }
    } 

    public static void main(String[] args){
        Calcu m = new Calcu();
        m.setSize(500,500);
        m.setVisible(true);
    }
}


//calculator