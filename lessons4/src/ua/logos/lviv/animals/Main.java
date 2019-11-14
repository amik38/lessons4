package ua.logos.lviv.animals;


public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Леопарда", 20, 7);

        System.out.println("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed() +
                " км/год, Вік тварини = " + animal.getAge() + " років");
       
        animal.setName("Бик");
        animal.setSpeed(2);
        animal.setAge(14);

        System.out.println("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed() +
                " км/год, Вік тварини = " + animal.getAge() + " років");
        

    }
}