/*
9. Animal Sound 
Scenario: You are building a zoo management system to play animal sounds. 
Problem Statement: 
Create a superclass Animal with method makeSound(). Subclass Dog and Cat override makeSound(). 
Classes/Fields: 
● Animal → makeSound() 
● Dog → “Bark” 
● Cat → “Meow” 
Sample Output: 
Dog → Bark 
Cat → Meow
*/

class Animal{
	public void makeSound(){
System.out.println("The entity makes a sound.");
	}
}
	// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {  // must stay public
        System.out.println("Dog → Bark");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {  // must stay public
        System.out.println("Cat → Meow");
    }
}

// Test class
public class AnimalSoundQ9 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();
        a2.makeSound();
    }
}