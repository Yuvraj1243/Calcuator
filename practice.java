class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Mammal extends Animal{
    public void run(){
        System.out.println("Animal is running");
    }
}

class Dog extends Mammal{
    public void bark(){
        System.out.println("Animal is barking");
    }
}

public class MultiLevel{
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.eat();
        myDog.run();
        myDog.bark();
    }
}
