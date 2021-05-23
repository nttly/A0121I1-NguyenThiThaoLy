package abstract_interface.thuc_hanh.animal_interface;
import abstract_interface.thuc_hanh.animal_interface.animal.Animal;
import abstract_interface.thuc_hanh.animal_interface.animal.Chicken;
import abstract_interface.thuc_hanh.animal_interface.animal.Tiger;
import abstract_interface.thuc_hanh.animal_interface.edible.Edible;
import abstract_interface.thuc_hanh.animal_interface.fruit.Fruit;
import abstract_interface.thuc_hanh.animal_interface.fruit.Orange;
import abstract_interface.thuc_hanh.animal_interface.fruit.Apple;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());;

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
