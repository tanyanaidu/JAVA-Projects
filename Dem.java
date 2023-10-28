abstract class Dem{
protected int a,b;
public void set(int x , int y){
a=x;
b=y;
}
}
class Dem2 extends Dem{
public void add(){
System.out.println(a+b);
}
public static void main(String args[]){
Dem2 a = new Dem2();
a.set(7,3);
a.add();
}
}
