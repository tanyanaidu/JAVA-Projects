import java.util.Scanner;
class Markss{
    protected int a,b;
    public void set(int x,int y){
        a=x;
        b=y;
    }
}

class Sports extends Markss{
    private int s;
    public void set(int z){
        s=z;
    }

    public void total(){
        System.out.println(a+b+s);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Sports s = new Sports();
        s.set(2,5);
        s.set(8);
        s.total();
    }
}

//single inheritence