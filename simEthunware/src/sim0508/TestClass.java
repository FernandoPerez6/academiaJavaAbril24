package sim0508;

import java.util.Arrays;

public class TestClass{
    char c;
    public void m1(){
        char[ ] cA = { 97 , 98};
        m2(c, cA);
        System.out.println( Arrays.toString(cA) );
    }
    public void m2(char c, char[ ] cA){
        c = 100;
        cA[1] = cA[0] = c;
    }
    public static void main(String args[]){
        new TestClass().m1();
    }
}