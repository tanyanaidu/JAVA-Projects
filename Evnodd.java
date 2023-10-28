import java.awt.*;
import java.awt.event.*;
class Evnodd extends Frame implements ActionListener{
    Label l1,l2;
    TextField t1;
    Button b1,b2;
    Evnodd(){
        setLayout(null);
        l1= new Label("Number");
        l2= new Label(" ");
        t1= new TextField();
        b1= new Button("CHECK");
        b2= new Button("EXIT");
        b1.addActionListener(this);
        b2.addActionListener(this);
        l1.setBounds(80,70,50,30);
        t1.setBounds(140,70,120,30);
        l2.setBounds(80,250,80,30);
        b1.setBounds(100,200,80,30);
        b2.setBounds(200,200,80,30);
        add(l1);
        add(l2);
        add(t1);
        add(b1);
        add(b2);
    }

    public void actionPerformed(ActionEvent e){ 
        if(e.getSource()==b1){
            String x = t1.getText();
            int a = Integer.parseInt(x);
            if (a%2==0){
                l2.setText(a+" IS EVEN");
            }
            else{
                l2.setText(a+" IS ODD");
            }
        }
        if(e.getSource()==b2){
            System.exit(0);
        }
    } 

    public static void main(String[] args){
        Evnodd m = new Evnodd();
        m.setSize(400,400);
        m.setVisible(true);
    }
}


//even odd