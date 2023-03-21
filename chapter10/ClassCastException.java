package chapter10;

public class ClassCastException {
	public static void main(String[] args) {
	
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
		

	}
	
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
			System.out.println(animal instanceof Dog);
		}else {
			System.out.println(animal instanceof Dog);
		}
	}

}


class Animal {}
class Dog extends Animal {};
class Cat extends Animal {};
