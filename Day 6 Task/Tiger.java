package day6;

public class Tiger extends Animal {
	String colour;
	
	public Tiger(int legs,float weight, String colour) {
		super(legs,weight);
		this.colour=colour;
		
		
		
	}
	public void walk() {
		System.out.println("tiger is walking");
	}
	public void doFeed(int food) {
		this.weight+=(food*20);
		System.out.println("weight of tiger after feeding"+weight);
	}
	
	
	public void doThings()
	{
		System.out.println("tiger is running");
	}

}
