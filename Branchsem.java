import java.awt.*;
import java.awt.event.*;
class Branchsem extends Frame implements ActionListener{
    Label l1,l2,l3;
    Choice c1,c2;
    Button b1,b2;
    Branchsem(){
        setLayout(null);
        l1= new Label("Branch");
        c1= new Choice();
        l2= new Label("Sem");
        c2= new Choice();
        l3= new Label("");
        b1= new Button("OK");
        b2= new Button("EXIT");
        b1.addActionListener(this);
        b2.addActionListener(this);
        l1.setBounds(80,70,50,30);
        c1.setBounds(140,70,60,30);
        l2.setBounds(80,130,50,30);
        c2.setBounds(140,130,60,30);
        l3.setBounds(80,250,50,30);
        b1.setBounds(50,200,80,30);
        b2.setBounds(140,200,80,30);
        c1.add("CSE");
        c1.add("IT");
        c1.add("CIVIL");
        c1.add("MECH");
        for (int i =1; i<=8; i++){
            c2.add(i+" ");
        }
        add(l1);
        add(c1);
        add(l2);
        add(c2);
        add(l3);
        add(b1);
        add(b2);
    }

    public void actionPerformed(ActionEvent e){ 
        String branch = c1.getSelectedItem();
        String sem = c2.getSelectedItem();
        if(e.getSource()==b1){
            l3.setText(branch+" "+sem);
        }
        if(e.getSource()==b2){
            System.exit(0);
        }
    } 

    public static void main(String[] args){
        Branchsem m = new Branchsem();
        m.setSize(500,500);
        m.setVisible(true);
    }
}


//choice for branch and sem
