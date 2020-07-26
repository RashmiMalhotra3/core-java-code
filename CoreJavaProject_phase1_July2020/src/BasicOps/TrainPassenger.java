package BasicOps;

import java.util.Random;

public class TrainPassenger {
	private long pnr;
	private String name;
	private int age;
	private char gender;
	
	//constructor - ok to leave it with default access
	TrainPassenger(String varnme, int varage, char vargen) {
		pnr =  new Random().nextLong();
		name = varnme;
		age = varage;
		gender  = vargen;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGen() {
		return gender;
	}
	public long getPnr() {
		return pnr;
	}
}