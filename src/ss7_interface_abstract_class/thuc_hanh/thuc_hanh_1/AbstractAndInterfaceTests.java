package ss7_interface_abstract_class.thuc_hanh.thuc_hanh_1;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                System.out.println(((Chicken) animal).howToEat());
            }
        }
        Orange orange = new Orange();
        System.out.println(orange.howToEat());
        Apple apple = new Apple();
        System.out.println(apple.howToEat());
    }
}
