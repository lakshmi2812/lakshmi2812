//Class that helps us learn about Getter and Setter methods in java that basically teach us about Encapsulation, a very important concept in JAVA. :)

public class GoodDog{
	private int size;
	
	public int getSize(){
		return this.size;
	}
	
	public void setSize(int s){
		this.size = s;
	}
	
	void bark(){
		if(this.size > 60){
			System.out.println("Grrrrr!!!! Grrrrr!!!! Ruff!! Ruff!! Ruff!! Ruff!!");
		}else{
			System.out.println("Grrr!! Grrr!! Ruff!! Ruff!!");
		}
	}
	
	
	public static void main(String[] args){
		GoodDog dog1 = new GoodDog();
		GoodDog dog2 = new GoodDog();
		
		dog1.setSize(90);
		dog2.setSize(3);
		System.out.println("Dog 1 barks so loudly like this: "); dog1.bark();
		System.out.println("Dog 2 barks little softly like this: "); dog2.bark();
		if(dog1.getSize() > 6)
		{
			System.out.println("Dog1 is a big dog!");
		}
		else
		{
			System.out.println("Dog1 is a small dog");
		}
	}
}