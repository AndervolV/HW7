public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int target = 2_459_000;
        int savings = 0;
        int salary = 15000;
        int month = 1;
        do {
            savings = savings + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
            month++;
        }
        while (savings <= target);
        System.out.println();
        System.out.println("Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i);
            i++;
        }

        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println("Задание 3");
        int population = 12_000_000;
        int year;
        int birthRate = 17;
        int mortality = 8;
        int demography = population / 1000 * (birthRate - mortality);
        for (year = 1; year <= 10; year++) {
            population = population + demography;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        System.out.println();
        System.out.println("Задание 4");
        float deposit = 15000;
        int targetDeposit = 12_000_000;
        month = 1;
        float income = 7;
        while (deposit <= targetDeposit) {
            deposit = deposit + deposit / 100 * income;
            System.out.println("Месяц " + month + ", сумма накоплений составляет " + deposit);
            month++;
        }

        System.out.println();
        System.out.println("Задание 5");
        deposit = 15000;
        month = 0;
        while (deposit <= targetDeposit) {
            deposit = deposit + deposit / 100 * income;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + deposit);
            }
        }

        System.out.println();
        System.out.println("Задание 6");
        deposit = 15000;
        int nineYears = 9 * 12;
        month = 0;
        while (month <= nineYears) {
            deposit = deposit + deposit / 100 * income;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + deposit);
            }
        }

        System.out.println();
        System.out.println("Задание 7");
        int friDay = 0;
        int day;
        for (day = 1; day <= 31; day = day + 1) {
            if (day % 7 == 0 && day != 0) {
                friDay = day - 2;
                System.out.println("Сегодня пятница, " + friDay + "-е число. Необходимо подготовить отчет ");
            }
        }
        System.out.println();
        System.out.println("Задание 8");
        int yearBefore = 2025;
        int z = yearBefore - 200;
        int s = yearBefore + 100;
        int cycle = 79;
        for (year = z; year <= s; year = year + 1) {
            if (year % cycle == 0 && year >= 1825)
                System.out.println(year);
        }
    }
}