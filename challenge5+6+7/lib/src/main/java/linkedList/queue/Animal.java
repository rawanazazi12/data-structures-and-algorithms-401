package linkedList.queue;

public class Animal {

    String animalType;

    public Animal(String animal) {
        this.animalType = animal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animal='" + animalType + '\'' +
                '}';
    }
}
