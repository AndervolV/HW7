public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int salary = 0;
        int month = 1;
        do {
            salary = salary + 15000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + salary + " рублей");
            month++;
        }
        while (salary <= 2_459_000);
        System.out.println();
        System.out.println("Задание 2");
        int i = 1;
        do {
            System.out.print(" " + i);
            i++;
        }
        while (i <= 10);
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println("Задание 3");
        int population = 12_000_000;
        int year = 1;
        do {
            population = population + population / 1000 * 9;
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year++;
        }
        while (year <= 10);

        System.out.println();
        System.out.println("Задание 4");
        int deposit = 15000;
        int montH = 1;
        do {
            deposit = deposit + deposit / 100 * 7;
            System.out.println("Месяц " + montH + ", сумма накоплений составляет " + deposit);
            montH++;
        }
        while (deposit <= 12_000_000);
        System.out.println();
        System.out.println("Задание 5");
        int deposiT = 15000;
        int monTH = 0;
        do {
            deposiT = deposiT + deposiT / 100 * 7;
            monTH++;
            if (monTH % 6 == 0) {
                System.out.println("Месяц " + monTH + ", сумма накоплений составляет " + deposiT);
            }
        }
        while (deposiT <= 12_000_000);
        System.out.println();
        System.out.println("Задание 6");
        int deposIT = 15000;
        int moNTH = 0;
        do {
            deposIT = deposIT + deposIT / 100 * 7;
            moNTH++;
            if (moNTH % 6 == 0) {
                System.out.println("Месяц " + moNTH + ", сумма накоплений составляет " + deposIT);
            }
        }
        while (moNTH <= 108);

        System.out.println();
        System.out.println("Задание 7");
        int friday = 0;
        for (i = 0; i <= 31; i = i + 1) {
            if (i % 7 == 0 && i != 0) {
                System.out.println("Сегодня пятница, " + i + "-е число ");
                friday = i;
            }
        }
        System.out.println();
        System.out.println("Задание 8");
        for (i = 0; i <= 2125; i = i + 1) {
            if (i % 79 == 0 && i >= 1825)
                System.out.println(i);
        }
    }
}