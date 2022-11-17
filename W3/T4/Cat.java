public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }
    public void sayanything() {
    	 System.out.println("Meow.");
    }
    /*@Override
    public Object clone() throws CloneNotSupportedException{
    	return super.clone();
    }
  */
    /*@Override
    public boolean equals(Object o) {
    	if(o instanceof Animal) {
    		return true;}
    	
		return false;  
    }*/
    @Override
    public String toString() {
    	return "This is the class Cat";
    }
 
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat myCat = new Cat();
        Animal myAnimal = (Animal)myCat.clone();
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        myAnimal.sayanything();
        System.out.println(myAnimal.toString());
        printClassName(myAnimal);
       
    }
}
