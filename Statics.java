import java.lang.Math;
abstract class Statics{
    protected int a;
    public void set(int a){
        int z=a;
    }
    public abstract void cal();
}
class Cube extends Statics{
    public void cal(){
    System.out.println("Cube= "+(a*a*a));
    }
}
class Square extends Statics{
    public void cal(){
    System.out.println("Square= "+(a*a));
    }
}
class Squareroot extends Statics{
    public void cal(){
    System.out.println("Squareroot= "+Math.sqrt(a));
    }
    public static void main(String[] args){
        Cube c = new Cube();
        Square s = new Square();
        Squareroot z = new Squareroot();
        c.set(3);
        s.set(9);
        z.set(2);
        c.cal();
        s.cal();
        z.cal();
    }
}
