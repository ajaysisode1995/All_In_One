package typicals;

class A {

    public void loadParamters()  {
        //this.executeTransaction();
        try {
			Integer a = new Integer("Lit");
		} catch (NumberFormatException e) {
			
			System.out.println(e.getMessage());
		}
    }

    public void executeTransaction() {
        System.out.println("Hello Class A");
    }
}

class B extends A {

    public void executePayment() throws NumberFormatException {
        try {
            loadParamters();
        } catch (Exception e) {
            System.out.println("exception catched");
        }

    }

    public void executeTransaction() {
        System.out.println("Hello Class B");
    }
    
    
};


public class Test {

    public static void main(String[] args) {
    	A a=new A();
//        B b = new B();
//        b.executePayment();
        a.loadParamters();
        a.executeTransaction();
    //  test();
    }
}