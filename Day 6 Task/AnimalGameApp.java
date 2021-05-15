package day6;

public class AnimalGameApp {

	public static void main(String[] args) {
AnimalGameApp app=  new AnimalGameApp();
		
		// Animal a = new Dog(); // down casting 
		
		
		Dog dog = new Dog(4,20f);
		app.doAnimalThings(dog, 2);
		
		System.out.println(" ------------------------");
		
		Cat cat = new Cat(4,8f);
		app.doAnimalThings(cat, 2);
		
		Tiger t1 = new Tiger(5,6f,"white");
		app.doAnimalThings(t1, 2);
	
	}
	
	public void doAnimalThings(Animal a,int food)
	{
		a.doWalk();
		a.doFeed(food);
		if( a instanceof Tiger) {
			Tiger t2 = (Tiger)a;
		}
		// ----------  instanceOf ----
		if(a instanceof Dog)  
			{
			   // call all dog related things
				
				Dog d = (Dog)a; // up casting 
				d.doPlayGames();
				
				/*
				 New Object creation will not work , because of state management
				Dog abc = new Dog();
				abc.doPlayGames(); 
				*/
			}
		if (a instanceof Cat )
			{
				Cat cat = (Cat)a;
				cat.doCatThings();
			}
		
	}

	}


