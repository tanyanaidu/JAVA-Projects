import java.util.Scanner;
class Student5{
    private int rno;
    private String name;

    public void set (int r,String n){
        rno=r;
        name=n;
    }
    public int getrno(){
        return rno;
    }
    public String getname(){
        return name;
    }
}

class  Marks extends Student5{
    protected Float a, b, c;
    public void set (Float m1,Float m2,Float m3){
        a = m1;
        b = m2;
        c = m3;
    }
    public float geta(){
        return a;
    }
    public float getb(){
        return b;
    }
    public float getc(){
        return c;
    }
}

class Sports1 extends Marks {
    private int s;
    public void set (int x){
        s = x;
    }
    public void total(){
        System.out.println(a+b+c+s);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        Sports1 s = new Sports1();
        s.set(101,"tanya");
        s.set(4.0f,5.1f,6.2f);
        s.set(7);

        System.out.println(s.getrno()+" "+s.getname());
        System.out.println(s.geta()+" "+s.getb()+" "+s.getc());
        s.total();
    }
}

//multi level inheritence

