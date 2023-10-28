class M2 {
    protected float m1,m2,m3;
    public void set(float a, float b ,float c){
        m1=a;
        m2=b;
        m3=c;
    }
}
interface IM2 {
    public abstract void cal1();  
    public abstract void cal2();  
}
class Totall extends M2 implements IM2{
    public void cal1(){
        System.out.println(m1+m2+m3);
    }
    public void cal2(){
        if (m1>m2 && m1>m2){
            System.out.println("m1 is greater");
        }
        else if (m1<m2 && m3<m2){
            System.out.println("m2 is greater");
        }
        else{
            System.out.println("m3 is greater");
        }
    }
    public static void main(String[] args){
        Totall t = new Totall();
        t.set(2,5,8);
        t.cal1();
        t.cal2();
    }
}
