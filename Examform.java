import java.awt.*;
import java.awt.event.*;
 
class Examform extends Frame implements ActionListener{
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b11,bnext, bprev,bans , bfin;
Label l,l1,l2;
int index,count;
Checkbox c1,c2,c3,c4,c5;
CheckboxGroup cbg;

String [] que ={"Q1. What is the capital of chattisgarh?",
"Q2. Who is the prime minister of india?",
"Q3. What is the full form of DVD?",
"Q4. which is the second largest country(in size) in world?",
"Q5. Which country is most populated in world?", 
"Q6. buying and selling in internet is called?",
"Q7. the world wide web is also knkwn as?",
"Q8. when did first human land on moon?", 
"Q9. what id the total number of districts in chattisgrah?",
"Q10. Total no. of planets in our solar system?"};
String [] op1 ={"Raipur","kejriwal","digital versatile disk","india" ,"africa","globalisation" , " digital magician","1969","23","7"};
String [] op2 ={"Bhilai","Bhupesh baghel","detail video disc","china" , "australia","e-commerce", "info age","1968","27","8"};
String [] op3 ={"kanker","sadiya yunus","detail versatile disc","canada" , "china" ,"consumerism" , "internet","1967","31","9"};
String [] op4 ={"Bilaspur","Narendra modi","data video disc","russia" ,"pakistan","tree market", " personal computer" ,"1966","33","10"};
int [] ans ={1,4,1,3,3,2,3,1,4,2};
int [] r = new int [10];

Examform(){
cbg = new CheckboxGroup();
c1= new Checkbox("A",cbg,false);
c2= new Checkbox("B",cbg,false);
c3= new Checkbox("C",cbg,false);
c4= new Checkbox("D",cbg,false);
c5= new Checkbox(" ",cbg,false);
l= new Label("EXAM PAPER");
l1= new Label(".....");
l2= new Label(".....");
b1=new Button("Q1");
b2=new Button("Q2");
b3=new Button("Q3");
b4=new Button("Q4");
b5=new Button("Q5");
b6=new Button("Q6");
b7=new Button("Q7");
b8=new Button("Q8");
b9=new Button("Q9");
b0=new Button("Q10");
bnext=new Button("NEXT");
bprev=new Button("PREV");
bans=new Button("ANS");
bfin=new Button("SUBMIT");
b11=new Button("EXIT");

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
add(bnext);
add(bprev);
add(bans);
add(b11);
add(bfin);
add(c1);
add(c2);
add(c3);
add(c4);
add(l1);
add(l2);

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
b11.addActionListener(this);
bnext.addActionListener(this);
bprev.addActionListener(this);
bans.addActionListener(this);
bfin.addActionListener(this);

l.setBounds(330,50,200,30);
b1.setBounds(90,100,50,30);
b2.setBounds(150,100,50,30);
b3.setBounds(210,100,50,30);
b4.setBounds(270,100,50,30);
b5.setBounds(330,100,50,30);
b6.setBounds(390,100,50,30);
b7.setBounds(450,100,50,30);
b8.setBounds(510,100,50,30);
b9.setBounds(570,100,50,30);
b0.setBounds(630,100,50,30);
l1.setBounds(150,200,600,30);
l2.setBounds(150,250,600,30);
c1.setBounds(210,300,200,30);
c2.setBounds(420,300,200,30);
c3.setBounds(210,350,200,30);
c4.setBounds(420,350,200,30);
bnext.setBounds(350,600,50,30);
bprev.setBounds(290,600,50,30);
bans.setBounds(410,600,50,30);
bfin.setBounds(150,650,60,30);
b11.setBounds(50,650,50,30);

GridLayout a = new GridLayout(3,3);
setLayout(null);

}

public static void main(String[]args){
Examform a = new Examform();
a.setSize(800,800);
a.setVisible(true);
}

public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
c5.setState(true);
index=0;
l1.setText(que[0]);
c1.setLabel(op1[0]);
c2.setLabel(op2[0]);
c3.setLabel(op3[0]);
c4.setLabel(op4[0]);
}

if(e.getSource()==b2){
c5.setState(true);
index=1;
l1.setText(que[1]);
c1.setLabel(op1[1]);
c2.setLabel(op2[1]);
c3.setLabel(op3[1]);
c4.setLabel(op4[1]);
}

if(e.getSource()==b3){
c5.setState(true);
index=2;
l1.setText(que[2]);
c1.setLabel(op1[2]);
c2.setLabel(op2[2]);
c3.setLabel(op3[2]);
c4.setLabel(op4[2]);
}

if(e.getSource()==b4){
c5.setState(true);
index=3;
l1.setText(que[3]);
c1.setLabel(op1[3]);
c2.setLabel(op2[3]);
c3.setLabel(op3[3]);
c4.setLabel(op4[3]);
}

if(e.getSource()==b5){
c5.setState(true);
index=4;
l1.setText(que[4]);
c1.setLabel(op1[4]);
c2.setLabel(op2[4]);
c3.setLabel(op3[4]);
c4.setLabel(op4[4]);
}

if(e.getSource()==b6){
c5.setState(true);
index=5;
l1.setText(que[5]);
c1.setLabel(op1[5]);
c2.setLabel(op2[5]);
c3.setLabel(op3[5]);
c4.setLabel(op4[5]);
}

if(e.getSource()==b7){
c5.setState(true);
index=6;
l1.setText(que[6]);
c1.setLabel(op1[6]);
c2.setLabel(op2[6]);
c3.setLabel(op3[6]);
c4.setLabel(op4[6]);
}

if(e.getSource()==b8){
c5.setState(true);
index=7;
l1.setText(que[7]);
c1.setLabel(op1[7]);
c2.setLabel(op2[7]);
c3.setLabel(op3[7]);
c4.setLabel(op4[7]);
}

if(e.getSource()==b9){
c5.setState(true);
index=8;
l1.setText(que[8]);
c1.setLabel(op1[8]);
c2.setLabel(op2[8]);
c3.setLabel(op3[8]);
c4.setLabel(op4[8]);
}

if(e.getSource()==b0){
c5.setState(true);
index=9;
l1.setText(que[9]);
c1.setLabel(op1[9]);
c2.setLabel(op2[9]);
c3.setLabel(op3[9]);
c4.setLabel(op4[9]);
}

if(e.getSource()==bnext){
index=index+1;
if (index==10){
index=0;
}
l1.setText(que[index]);
c1.setLabel(op1[index]);
c2.setLabel(op2[index]);
c3.setLabel(op3[index]);
c4.setLabel(op4[index]);
}

if(e.getSource()==bprev){
index=index-1;
if (index==-1){
index=9;
}
l1.setText(que[index]);
c1.setLabel(op1[index]);
c2.setLabel(op2[index]);
c3.setLabel(op3[index]);
c4.setLabel(op4[index]);
}

if(e.getSource()==bans){
int x=0;
if (c1.getState()){
x=1;
}
if (c2.getState()){
x=2;
}
if (c3.getState()){
x=3;
}
if (c4.getState()){
x=4;
}
if (x==ans[index]){
l2.setText("Your answer is Correct!");
r[index]=1;

}
else{
l2.setText("your answer is Incorrect!");
r[index]=0;
}
}

if(e.getSource()==bfin){
count=0;
for( int i=0 ;i<r.length;i++){
count=count+r[i];
}
l2.setText("You scored "+count+"/10");
}


if(e.getSource()==b11){
System.exit(0);
}

}
}
