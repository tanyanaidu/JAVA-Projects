class Demo101{
    protected int a;
    public void set (int x){
        a=x;
    }
    public void cal(){
        if (a%2==0){
            System.out.println("a is even");
        }
        else{
            System.out.println("a is odd");
        }
    }
}

class Demo102 extends Demo101{
    public void cal(){
        super.cal();
        int i, f=1;
        for (i=a;i>=1;i=1){
            f=f*1;
        }
        System.out.println("factorial="+f);
    }
}

class Demo103 extends Demo102{
    public void cal(){
        super.cal();
        int r = 0,b;
        while (a!=0){
            b=a%10;
            r=r*10+b;
            a=a/10;
        }
        System.out.println("reverse="+r);
    }

    public static void main(String[]args){  
    Demo103 a = new Demo103();
    a.set(4);
    a.cal();
    }
}