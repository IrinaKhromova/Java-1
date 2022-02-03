/**
* Java 1 HomeWork 7
*
* @author Irina Khromova
* @version 4.02.2021
*/

public class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 30),
                new Cat("Murzic", 12),
                new Cat("Tom", 8),
                new Cat("Pushok", 6)
        };
        
        Plate plate = new Plate(25);
        System.out.println("Food on a " + plate);
        
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
        }
        
        plate.addFood(35);
        System.out.println("Add food to the " + plate);
        
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
        }
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean isFull;
    
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }
    
    public void eat(Plate plate) {
        boolean hungry = true;
        if (hungry =! isFull && plate.decreaseFood(appetite)) {
            isFull = true;
        }
    }
    
    @Override
    public String toString() {
        return name + ": " + "appetite " + appetite + 
        "; The cat is full - " + isFull;
    }
}

class Plate {
    private int food;
    
    Plate(int food) {
        this.food = food;
    }
    
    public boolean decreaseFood(int appetite) {
        if(food < appetite) {
            return false;
        } else {
            food -= appetite;
            return true;
        }
    }
    
    public void addFood(int food) {
        this.food += food;
    }
    
    @Override
    public String toString() {
        return "plate: " + food;
    }
}

