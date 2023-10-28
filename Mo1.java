class Mo1 {
    protected float m1,m2,m3;
    public void set(float a, float b ,float c){
        m1=a;
        m2=b;
        m3=c;
    }
}
interface IMo1 {
    public abstract void cal();   
}
class Totall extends Mo1 implements IMo1{
    public void cal(){
        System.out.println(m1+m2+m3);
    }
    public static void main(String[] args){
        Totall t = new Totall();
        t.set(2,5,8);
        t.cal();
    }
}
