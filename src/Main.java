public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println("Число " + i);
        }
        System.out.println("Task 2");
        for (int i = 10; i >= 0; i = i - 1) {
            System.out.println("Число " + i);
        }
        System.out.println("Task 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Число " + i);
        }
        System.out.println("Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Число " + i);
        }
        System.out.println("Task 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }
        System.out.println("Task 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Task 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Task 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13; i = i + 1) {
            total = salary + total;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.println("Task 9");
        int salaryTwo = 29000;
        int totalSalary = 0;
        for (int i = 1; i < 13; i = i + 1) {
            totalSalary = totalSalary + totalSalary / 100;
            totalSalary = salaryTwo + totalSalary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSalary + " рублей.");
        }
        System.out.println("Task 10");
        int number = 2;
        System.out.println("Таблица умножения на " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + "x" + i + "=" + result);
        }


    }
}