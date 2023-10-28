import java.awt.*;
import java.awt.event.*;
class Malefemale extends Frame{
    Button b1,b2;
    Checkbox c1,c2;
    CheckboxGroup cbg;
    Malefemale(){
        setLayout(null);
        c1= new Checkbox("Male",cbg,false);
        c2= new Checkbox("Female",cbg,true);
        cbg = new CheckboxGroup();
        b1= new Button("OK");
        b2= new Button("EXIT");
        b1.addActionListener(this);
        b2.addActionListener(this);

        c1.setBounds(50,100,30,30);
        c2.setBounds(100,100,30,30);
        b1.setBounds(50,200,80,30);
        b2.setBounds(100,200,80,30);
        add(c1);
        add(c2);
        add(b1);
        add(b2);
    }

    public void actionPerformed(ActionEvent e){ 
        if(e.getSource()==b1){
        }
        if(e.getSource()==b2){
            System.exit(0);
        }
    }

    public static void main(String[] args){
        Malefemale m = new Malefemale();
        m.setSize(300,300);
        m.setVisible(true);
    }
}

//two rows in awt to check male and female