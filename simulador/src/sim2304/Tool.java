package sim2304;

class Tool {
    private void repair(){} //r1
    
    void use(){}
    
    void ejecuta() {} //default
}

class Hammer extends Tool{

    //private int repair(){return 0;} //r3
	
	private void repair(){return;}

    void use(){return;}//r4

    public void bang(){}//r5
    
    @Override
    protected void ejecuta() {} //default
}
