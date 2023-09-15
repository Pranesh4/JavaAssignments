package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("applyBreak");
	}
	public void soundhorn() {
		System.out.println("soundHorn");
	}
	public void turnOnAc() {
		System.out.println("turnOnAc");
	}
	public static void main (String[] args) {
	 Car bmw = new Car();
	 bmw.applyBreak();
	 bmw.soundhorn();
	 bmw.turnOnAc();
		 
	}

}
