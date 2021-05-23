package abstract_interface.thuc_hanh.animal_interface.animal;
import abstract_interface.thuc_hanh.animal_interface.edible.Edible;
public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
