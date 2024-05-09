package main;

public class PolymorphismPracticeBefore {
    class Animal {
        public void makeSound() {
            System.out.println("Some generic animal sound");
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

        // Llamamos al método makeSound() a través de una referencia de la clase Animal
        dog.makeSound(); // Output: Woof!
        cat.makeSound(); // Output: Meow!
    }
}
