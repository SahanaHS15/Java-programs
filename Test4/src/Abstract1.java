
public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnimalSound a=new AnimalSound();
a.makeSound();
a.eat();
	}

}
abstract class Animal{
	abstract void makeSound();
	
	public void eat() {
		System.out.println("Eating!!!");
	}
}

class AnimalSound extends Animal{
	void makeSound() {
		System.out.println("Sound!!!");
		
	}
}