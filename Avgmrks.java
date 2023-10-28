import java.awt.*;
import java.awt.event.*;
class Avgmrks extends Frame implements ActionListener{
    Label l1,l2,l3,l4;
    Choice c1,c2,c3;
    Button b1,b2;
    Avgmrks(){
        setLayout(null);
        l1= new Label("Marks 1");
        c1= new Choice();
        l2= new Label("Marks 2");
        c2= new Choice();
        l3= new Label("Marks 3");
        c3= new Choice();
        l4= new Label("");

        b1= new Button("AVERAGE");
        b2= new Button("EXIT");
        b1.addActionListener(this);
        b2.addActionListener(this);

        l1.setBounds(80,70,50,30);
        c1.setBounds(140,70,60,30);
        l2.setBounds(80,130,50,30);
        c2.setBounds(140,130,60,30);
        l3.setBounds(80,190,50,30);
        c3.setBounds(140,190,60,30);
        b1.setBounds(50,230,80,30);
        b2.setBounds(140,230,80,30);
        l4.setBounds(90,270,150,30);

        for (int i =0; i<=100; i++){
            c1.add(i+"");
            c2.add(i+"");
            c3.add(i+"");
        }
        add(l1);
        add(c1);
        add(l2);
        add(c2);
        add(l3);
        add(c3);
        add(b1);
        add(b2);
        add(l4);
    }

    public void actionPerformed(ActionEvent e){ 
        String m = c1.getSelectedItem();
        int a = Integer.parseInt(m);
        String n = c2.getSelectedItem();
        int b = Integer.parseInt(n);
        String o = c3.getSelectedItem();
        int c = Integer.parseInt(o);
        if(e.getSource()==b1){
            l4.setText("Average marks : "+((a+b+c)/3)+"");
        }
        if(e.getSource()==b2){
            System.exit(0);
        }
    } 

    public static void main(String[] args){
        Avgmrks m = new Avgmrks();
        m.setSize(500,500);
        m.setVisible(true);
    }
}


//avg of three marks
