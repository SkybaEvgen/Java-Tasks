public class Task_1 {
    public static void main(String[] args) {
        Person p = new Boy();
        p.doSport();
    }
}

class Person {
    public void doSport() {
        System.out.println("Persons sport");
    }
}

class Boy extends Person {
    public void doSport() {
        System.out.println("Boys sport");
    }
}
