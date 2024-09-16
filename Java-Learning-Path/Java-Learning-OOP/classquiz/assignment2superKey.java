
/*Using examples write a java program to demonstrate usage of super keyword */

class Animal {
    void sound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("The dog barks.");
    }

    void displaySound() {
        super.sound();  // Calls the superclass method
        sound();        // Calls the subclass method
    }
}

public class assignment2superKey {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displaySound();
    }
}
