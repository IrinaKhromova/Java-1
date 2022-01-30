/**
* Java 1 HomeWork 6
*
* @author Irina Khromova
* @version 30.01.2021
*/

/*Создать классы Собака и Кот с наследованием от класса Животное.
Все животные могут бежать и плыть. В качестве параметра каждому методу
передается длина препятствия. Результатом выполнения действия будет
печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
У каждого животного есть ограничения на действия
(бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.)
*/

class HomeWork6 {
    public static void main (String[] args) {
        IAnimal[] animals = {
            new Cat("Barsik", 200, 0), new Dog("Palkan", 500, 10),
            new Cat("Murzic", 300, 0), new Dog("Mukhtar", 600, 18)
        };
        for (IAnimal animal : animals) {
            System.out.println(animal.run(150));
            System.out.println(animal.swim(8));
            System.out.println(animal.run(350));
            System.out.println(animal.swim(10));
            System.out.println(animal.run(550));
            System.out.println(animal.swim(15));
        }
    }
}

class Cat extends Animal {
    Cat(String name, int runlimit, int swimlimit) {
        super(name, runlimit, swimlimit);
    }
    
    @Override
    public String swim(int swimdistance) {
        return name + ": cats can't swim";
    }
}

class Dog extends Animal {
    Dog(String name, int runlimit, int swimlimit) {
        super(name, runlimit, swimlimit);
    }
}

interface IAnimal {
    String run(int rundistance);
    String swim(int swimdistance);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected int runlimit;
    protected int swimlimit;
    
    Animal (String name, int runlimit, int swimlimit) {
        this.name = name;
        this.runlimit = runlimit;
        this.swimlimit = swimlimit;
    }
    
    @Override
    public String run(int rundistance) {
        if (rundistance < 0 || rundistance > runlimit) {
            return name + ": Exceeding the run distance limit!";
        } else {
            return name + ": run " + rundistance + " m";
        }
    }
    
    @Override
    public String swim(int swimdistance) {
        if (swimdistance < 0 || swimdistance > swimlimit) {
            return name + ": Exceeding the swim distance limit!";
        } else {
            return name + ": swim " + swimdistance + " m";
        }
    }
    
}

