package BasicOps;

public class AccessModifierExample1 {
	private int pvy;
	public char pbl;
	static String stat = "";
	public final String lang = "java";
	
	public void methodPublic(int arg1) {
		System.out.println("setting pvy to: " +arg1);
		methodPrivate(arg1);
	}
	
	private void methodPrivate(int arg1) {
		pvy = arg1;
	}
	
	protected void methodProtected() {
		System.out.println("current value of pvy is: " +pvy);
	}
	
	static void methodStatic() {
		stat = "Simplilearn";
		System.out.println("current value of stat is: " +stat);
	}

}
