package chapter10;

public class Zoo {

    public static void main(String[] args) {

        Dog rockey = new Dog();
        rockey.fetch();
        rockey.makeSound();
        feed(rockey);


        Animal sasha = new Dog();
        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();
        sasha.scratch();
        feed(sasha);


    }

    public static void feed (Animal animal){
        if(animal instanceof Dog){
            System.out.println("here's your dog food");
        }
        else if(animal instanceof Cat){
            System.out.println("here's your cat food");
        }
    }
}
