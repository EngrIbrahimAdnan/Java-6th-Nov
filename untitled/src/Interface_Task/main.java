package Interface_Task;

public class main {
    public static void main(String[] args){
        cat newCat = new cat();
        dog newDog = new dog();

        newCat.eat();
        newCat.sleep();
        newCat.makeSound();

        newDog.eat();
        newDog.sleep();
        newDog.makeSound();

    }
}
