class Dog{

	String name;
	int age;
	
	public Dog(){
		name = "lakshmi";
		}
	
		public void bark(){
			System.out.print(name + "Ruff! Ruff! \n");
			System.out.print(" My age is :" + age + "\n");
						}
						
						public static void main(String[] args){
							Dog d = new Dog();
							
							Dog[] myDogs = new Dog[4];
							
							myDogs[0] = new Dog();
							myDogs[1] = new Dog();
							myDogs[2] = new Dog();
							myDogs[3] = d;
							
							myDogs[0].name = "Snoopy";
							myDogs[1].name = "Cookie";
							myDogs[2].name = "Scooby";
							//myDogs[3].name = "Chico";
							

							for(int i = 0; i < myDogs.length; i++){
								myDogs[i].bark();
								}
							
}

}