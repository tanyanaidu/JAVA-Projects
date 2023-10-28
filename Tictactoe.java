import java.awt.*;
import java.awt.event.*;
 
class Tictactoe extends Frame implements ActionListener{
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
Label l,l1,l2,l3;
int t=1,c1=0,c2=0;
void restart(){
t=1;
b1.setLabel("");
b2.setLabel("");
b3.setLabel("");
b4.setLabel("");
b5.setLabel("");
b6.setLabel("");
b7.setLabel("");
b8.setLabel("");
b9.setLabel("");
}

Tictactoe(){
b1=new Button("");
b2=new Button("");
b3=new Button("");
b4=new Button("");
b5=new Button("");
b6=new Button("");
b7=new Button("");
b8=new Button("");
b9=new Button("");
b0=new Button("EXIT");
l1=new Label("P1 : 0");
l2=new Label("P2 : 0");
l3=new Label("");
l=new Label("TICTACTOE");

add(l);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b0);
add(l1);
add(l2);
add(l3);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);

l.setBounds(90,50,100,30);
b1.setBounds(50,100,50,30);
b2.setBounds(120,100,50,30);
b3.setBounds(190,100,50,30);
b4.setBounds(50,150,50,30);
b5.setBounds(120,150,50,30);
b6.setBounds(190,150,50,30);
b7.setBounds(50,200,50,30);
b8.setBounds(120,200,50,30);
b9.setBounds(190,200,50,30);
l1.setBounds(50,250,50,30);
l2.setBounds(120,250,50,30);
l3.setBounds(50,300,200,30);
b0.setBounds(50,350,50,30);

setLayout(null);
}

public static void main(String[]args){
Tictactoe a = new Tictactoe();
a.setSize(500,500);
a.setVisible(true);
}

public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
if (b1.getLabel().length()==0){
if(t%2==1){
b1.setLabel("*");
}
else{
b1.setLabel("0");
}
t++;
}
}

if(e.getSource()==b2){
if (b2.getLabel().length()==0){
if(t%2==1){
b2.setLabel("*");
}
else{
b2.setLabel("0");
}
t++;
}
}

if(e.getSource()==b3){
if (b3.getLabel().length()==0){
if(t%2==1){
b3.setLabel("*");
}
else{
b3.setLabel("0");
}
t++;
}
}

if(e.getSource()==b4){
if (b4.getLabel().length()==0){
if(t%2==1){
b4.setLabel("*");
}
else{
b4.setLabel("0");
}
t++;
}
}

if(e.getSource()==b5){
if (b5.getLabel().length()==0){
if(t%2==1){
b5.setLabel("*");
}
else{
b5.setLabel("0");
}
t++;
}
}

if(e.getSource()==b6){
if (b6.getLabel().length()==0){
if(t%2==1){
b6.setLabel("*");
}
else{
b6.setLabel("0");
}
t++;
}
}

if(e.getSource()==b7){
if (b7.getLabel().length()==0){
if(t%2==1){
b7.setLabel("*");
}
else{
b7.setLabel("0");
}
t++;
}
}

if(e.getSource()==b8){
if (b8.getLabel().length()==0){
if(t%2==1){
b8.setLabel("*");
}
else{
b8.setLabel("0");
}
t++;
}
}

if(e.getSource()==b9){
if (b9.getLabel().length()==0){
if(t%2==1){
b9.setLabel("*");
}
else{
b9.setLabel("0");
}
t++;
}
}

if(e.getSource()==b0){
System.exit(0);
}

String a = b1.getLabel();
String b = b2.getLabel();
String c = b3.getLabel();
String d = b4.getLabel();
String e1 = b5.getLabel();
String f = b6.getLabel();
String g = b7.getLabel();
String h = b8.getLabel();
String i = b9.getLabel();

if(a.length()!=0 && b.length()!=0 && c.length()!=0){
if(a.equals(b) && a.equals(c)){
if(a.equals("*")){
l3.setText("player 1 is winner ");
c1++;
l1.setText("P1 :"+c1);
}
else{
l3.setText("player 2 is winner");
c2++;
l2.setText("P2 :"+c2);
}
restart();
}
}

if(a.length()!=0 && e1.length()!=0 && i.length()!=0){
if(a.equals(e1) && a.equals(i)){
if(a.equals("*")){
l3.setText("player 1 is winner ");
c1++;
l1.setText("P1 :"+c1);
}
else{
l3.setText("player 2 is winner");
c2++;
l2.setText("P2 :"+c2);
}
restart();
}
}

if(a.length()!=0 && d.length()!=0 && g.length()!=0){
if(a.equals(d) && a.equals(g))
{
if(a.equals("*")){
l3.setText("player 1 is winner ");
c1++;
l1.setText("P1 :"+c1);
}
else{
l3.setText("player 2 is winner");
c2++;
l2.setText("P2 :"+c2);
}
restart();
}
}

if(b.length()!=0 && e1.length()!=0 && h.length()!=0){
if(b.equals(e1) && b.equals(h)){
if(b.equals("*")){
l3.setText("player 1 is winner ");
c1++;
l1.setText("P1 :"+c1);
}
else{
l3.setText("player 2 is winner");
c2++;
l2.setText("P2 :"+c2);
}
restart();
}
}

if(d.length()!=0 && e1.length()!=0 && f.length()!=0){
if(d.equals(e1) && d.equals(f)){
if(d.equals("*")){
l3.setText("player 1 is winner ");
c1++;
l1.setText("P1 :"+c1);
}
else{
l3.setText("player 2 is winner");
c2++;
l2.setText("P2 :"+c2);
}
restart();
}
}

if(g.length()!=0 && e1.length()!=0 && c.length()!=0){
if(g.equals(e1) && g.equals(c)){
if(g.equals("*")){
l3.setText("player 1 is winner ");
c1++;
l1.setText("P1 :"+c1);
}
else{
l3.setText("player 2 is winner");
c2++;
l2.setText("P2 :"+c2);
}
restart();
}
}

if(c.length()!=0 && f.length()!=0 && i.length()!=0){
if(c.equals(f) && c.equals(i)){
if(c.equals("*")){
l3.setText("player 1 is winner ");
c1++;
l1.setText("P1 :"+c1);
}
else{
l3.setText("player 2 is winner");
c2++;
l2.setText("P2 :"+c2);
}
restart();
}
}

if(g.length()!=0 && h.length()!=0 && i.length()!=0){
if(g.equals(h) && g.equals(i)){
if(g.equals("*")){
l3.setText("player 1 is winner ");
c1++;
l1.setText("P1 :"+c1);
}
else{
l3.setText("player 2 is winner");
c2++;
l2.setText("P2 :"+c2);
}
restart();
}
}

if(t==10){
l3.setText("DRAW");
restart();
}

l1.setText("p1 "+c1);
l2.setText("p2 "+c2);
if (c1==3){
l3.setText("player 1 is winner");
}
if (c2==3){
l3.setText("player 2 is winner");
}


}
}