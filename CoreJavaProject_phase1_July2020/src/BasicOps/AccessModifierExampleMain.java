package BasicOps;

public class AccessModifierExampleMain {

	public static void main(String[] args) {
		//note - you can call a static method by instantiating a new object for that class-
		System.out.println("current value of stat is: " + AccessModifierExample1.stat);
		AccessModifierExample1.methodStatic();
		
		//create new instance of AccessModifierExample1
		AccessModifierExample1 e1 = new AccessModifierExample1();
		e1.pbl = 'x';
		
		/*e1.lang = "python";
		 * cannot change value of Final. will give error.
		 */
		
		System.out.println("current value of pbl is: " + e1.pbl);
        e1.methodPublic(10);
        e1.methodProtected();
	}

}
