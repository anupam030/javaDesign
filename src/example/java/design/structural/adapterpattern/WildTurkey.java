package example.java.design.structural.adapterpattern;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("WildTurkey gobble");
	}

	@Override
	public void fly() {
		System.out.println("WildTurkey flys");
	}

}
