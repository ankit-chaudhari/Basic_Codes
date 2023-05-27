package variables1;

public class Multilevel_Inheritance {
		

			  public Multilevel_Inheritance () {
			    System.out.print("A ");
			  }
			}

			class B extends Multilevel_Inheritance  {

			  public B() {
			    System.out.print("B ");
			  }
			}

			class C extends B {

			  public C() {
			    System.out.print("C ");
			  }

			  public static void main(String[] args) {
			    C c = new C();
			  
	}

}
