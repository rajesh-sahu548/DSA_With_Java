
package programmerpoint;
import java.util.*;

import javax.sound.sampled.SourceDataLine;
import javax.xml.transform.SourceLocator;

import java.nio.channels.Pipe.SourceChannel;

   
class test{
int a=10;
int b;
static int i=100;
static int j;
void m1(){
  System.out.println(
    "m1 instance method "
  );
}
void m2(int i, char ch,String str){
  System.out.println(i);
  System.out.println(ch);
  System.out.println(str);
}
static void m3(int i, int j){
  System.out.println(i);
  System.out.println(j);
}
static void m4(String str,char ch){
System.out.println(str);
System.out.println(ch);
}

test(){
  System.out.println("counstructer");
}
test(int i,int j){
  System.out.println("2 construccter");
}
{
  System.out.println("instance block");
}
{
  System.out.println("instance block2 ");
}
static {
  System.out.println("bhopal");
}
static{
  System.out.println("indore");
}

     public static  void main(String[] args) {
// Sytem.out.println("sahu");
test t= new test();
test t1= new test(1, 2);
t.m1();;
t.m2(1, 'y', "rajesh");
m3(1, 12);
m4(null, 'l');
System.out.println(t.a);
System.out.println(t.b);
System.out.println(i);
System.out.println(j);

}
    }