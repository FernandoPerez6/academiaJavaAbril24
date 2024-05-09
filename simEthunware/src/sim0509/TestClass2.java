package sim0509;
import java.io.*;

//How can you fix the following code to make it compile:
	
class Great2 {
	public void doStuff() throws IOException{
    }    
}

class Amazing2 extends Great2  { 
  @Override	
	public void doStuff() throws IllegalArgumentException {
	  System.out.println("Método: doStuff de Amazing");
  }    
}

public class TestClass2 {
    public static void main(String[] args) throws IOException {
    	Great2 g = new Amazing2();
        g.doStuff();
    }
}
//Assume that changes suggested in a option are to be applied independent of other options.