//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        int humanage = 17;
        if (humanage >= 18) {
            System.out.println("Если возраст челоека равен " + humanage + " , то он соершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + humanage + ", то он не достиг соершеннолетия, нужно немного подождать.");
        }

        // Задача 2
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        // Задача 3
        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость  " + speed + " , то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно.");
        }

        // Задача 4
        int age = 20;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то ему пора ходить на работу.");
        }

        // Задача 5
        int ageOfChild = 12;
        if (ageOfChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему нельзя кататься на аттракционе.");
        } else if (ageOfChild >= 5 && ageOfChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        // Задача 6
        int totalCapacity = 102;
        int seatingCapacity = 60;
        int standingCapacity = 42;
        int passengers = 80;

        if (passengers <= seatingCapacity) {
            System.out.println("Есть место в вагоне. Можно сесть.");
        } else if (passengers <= totalCapacity) {
            System.out.println("Сидячие места все заняты. Можно стоять.");
        } else {
            System.out.println("Вагон полностью забит.");
        }

        // Задача 7

        int one = 5;
        int two = 10;
        int three = 7;

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}
