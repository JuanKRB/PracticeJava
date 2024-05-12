package main;

public class PolymorphismPracticeBefore {
    class Animal {
        public void makeSound() {
            System.out.println("Generic animal sound");
        }
    }

    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof!");
        }
    }

    class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow!");
        }
    }

    public static void main(String[] args) {
        PolymorphismPracticeBefore instance = new PolymorphismPracticeBefore();
        Animal dog = instance.new Dog();
        Cat cat = instance.new Cat();

        
        dog.makeSound(); 
        cat.makeSound(); 
    }
}
