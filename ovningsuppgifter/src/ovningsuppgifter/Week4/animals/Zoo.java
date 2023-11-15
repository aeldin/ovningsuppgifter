package ovningsuppgifter.Week4.animals;


import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class Zoo implements Iterable<Animal> {
    int index = 0;

    private Animal [] animals = new Animal[10];
    void add(Animal a) {
        for (int i = 0; i < animals.length; i++) {
        if (animals[i] == null) {
            animals[i] = a;
            return;
          }
        }
    }

    Animal get(int index) {
        return animals[index];
    }


    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.add(new Cat(1));
        zoo.add(new Dog(2));
        for (Animal animal : zoo) {
            System.out.println(animal);
        }
        zoo.forEach(System.out::println);
    }

    public void forEach (Consumer<? super Animal> consumer) {
        for (Animal animal : animals) {
            if (animal != null) {
                consumer.accept(animal);
            }
        }
    }

    @Override
    public Iterator<Animal> iterator() {
        return new ZooIterator();
    }
    class ZooIterator implements Iterator<Animal> {
        int index;

        @Override
        public boolean hasNext() {
            return animals[index] != null;
        }

        @Override
        public Animal next() {
            if (animals[index] == null)
                throw new NoSuchElementException();
            return animals[index++];
        }
    }
}
