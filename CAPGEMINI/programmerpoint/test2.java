package programmerpoint;

public class test2 {
    static int a=100;
    int b;

    {
        // int a= 1;
        this.b=200;
        int c=300;
        System.out.println(a);
        System.out.println(this.b);
        System.out.println(c);
    }
    test2(){
int d=400;
System.out.println(d);
    }
    void m1(){
        int e=500;
        System.out.println(e);
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
 public static void main(String[] args) {
    test2 t= new test2();
    t.m1();
 }   
}
