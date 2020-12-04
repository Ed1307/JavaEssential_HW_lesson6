package zoo;

import java.util.ArrayList;

class Zoo {
    public static void main(String[] args) {
    Animal a1 = new Animal();
    Animal a2 = new Animal();
    Animal a3 = new Animal();
    Animal a4 = new Animal();
    Animal a5 = new Animal();
    Animal a6 = new Animal();
    Animal a7 = new Animal();
    Animal a8 = new Animal();

    ArrayList <Animal> animals = new ArrayList<>();
    animals.add (0, a1);
    animals.add (1, a2);
    animals.add (2, a3);
    animals.add (3, a4);
    animals.add (4, a5);
    animals.add (5, a6);
    animals.add (6, a7);
    animals.add (7, a8);

    animals.remove(2);
    animals.remove(3);
    animals.remove(4);

    System.out.println(animals.size());
    }
}

class Animal{

}