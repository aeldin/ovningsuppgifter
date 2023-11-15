package ovningsuppgifter.Week4.animals;

import java.util.Arrays;
import java.util.Objects;

public abstract class Animal implements Comparable<Animal> {


    private int size;
    private final String name;



    public Animal(int size, String name) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return size == animal.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    public static void main(String[] args) {
        Animal cat = new Cat(1);
        Animal dog = new Dog(1);


        System.out.println((cat.equals(dog)));

        Animal[] animals = {cat, dog, new Cat(6), new Dog(25), new Dog(3), new Cat(2)};
        System.out.println("before sort" + Arrays.toString(animals));
        Arrays.sort(animals);
        System.out.println("after sort" + Arrays.toString(animals));
    }
}


class Cat extends Animal {

    public Cat(int size) {
        super(size, "Cat");
    }

    @Override
    public String toString(){
        return "Cat{" +
                "name='" + "Cat" + '\'' +
                ", size=" + this.getSize() +
                '}';
    }


    @Override
    public int compareTo(Animal o) {
        return Integer.compare(getSize(), o.getSize());
    }
}

class Dog extends Animal {

    public Dog(int size) {
        super(size, "Dog");
    }

    @Override
    public String toString(){
        return "Dog{" +
                "name='" + "Dog" + '\'' +
                ", size=" + this.getSize() +
                '}';
    }
   @Override
   public int compareTo(Animal o) {
        return Integer.compare(getSize(), o.getSize());
    }
}