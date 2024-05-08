package sim0507;

public class Speak {
    public static void main(String[] args) {
        Speak s = new GoodSpeak();
        //s.up(); //NO SE PUEDE
        ((GoodSpeak)s).up();
        ((Tone)s).up();
        
        Speak s2 = new Speak();
        ((Tone)s2).up(); //ClassCastException
        
    }
}

class GoodSpeak extends Speak implements Tone {
    public void up() {
        System.out.println("UP UP UP");
    }
}

interface Tone {
    void up();
}
