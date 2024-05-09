package sim0509;
import java.io.*;

	
//How can you fix the following code to make it compile:
import java.io.*;
class Great {
    public void doStuff() throws IOException{
    }    
}

class Amazing extends Great { 
  public void doStuff() {
  }    
}

public class TestClass {
    public static void main(String[] args) throws IOException {
        Great g = new Amazing();
        g.doStuff();
    }
}
//Assume that changes suggested in a option are to be applied independent of other options.