package chapter10;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("woof");
    }
    public void fetch(){
        System.out.println("fetch is fun");
    }
}
