/**
* Java 1 HomeWork 5
*
* @author Irina Khromova
* @version 27.01.2021
*/

class HomeWork5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan Ivanovich", "math teacher",
            "ivanovi@mailbox.com", "892312310", 70000, 43);
        persArray[1] = new Person("Petrov Petr Petrovich", "history teacher",
            "petrovp@mailbox.com", "892312311", 47000, 28);
        persArray[2] = new Person("Sidorov Sidor Sidorovich", "geography teacher",
            "sidorovs@mailbox.com", "892312312", 48000, 50);
        persArray[3] = new Person("Ignatova Svetlana Sergeevna", "physics teacher",
            "ignatovas@mailbox.com", "892312313", 65000, 55);
        persArray[4] = new Person("Dubinina Elena Viktorovna", "art teacher",
            "dubininae@mailbox.com", "892312314", 30000, 26);
            
        for (Person person : persArray) {
            if (person.getAge() > 40) {
                System.out.println(person.toString());
            }
        }
    }
}
    
class Person {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;
        
    Person(String fio, String position, String email, String phone, double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    @Override
    public String toString() {
        return "fio: " + fio + "; position: " + position + "; email: " + email + 
                "; phone: " + phone + "; salary: " + salary + "; age: " + age;
    }
    public int getAge() {
        return age;
    }
}


