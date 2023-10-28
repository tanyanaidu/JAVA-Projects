import java.util.Scanner;
class Shape{
    protected int a;
    public void set(int x){
    a=x;
    }
}
class Squares extends Shapey1{
    public void call(){
        System.out.println("Area of square = "+(a*a));
    }
}
class Circlein extends Shapey1{
    public void call(){
        System.out.println("Area of circle = "+(3.14*a*a));
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Squares s = new Squares();
        Circlein c = new Circlein();
        s.set(7);
        c.set(2);
        s.call();
        c.call();
    }
}


//Hierarchical inheritance