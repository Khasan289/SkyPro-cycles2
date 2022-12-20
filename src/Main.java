public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");

        int month = 0;
        int contribution = 0;
        while (contribution <= 2_459_000) {
            month = month + 1;
            contribution = contribution + 15_000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + contribution + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println();

        for (a = 10; a >= 1; a = a - 1) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        int totalPopulation = 12_000_000;
        int years = 0;
        int growth = 17;
        int mortality = 8;
        while (years < 10) {
            years = years + 1;
            int growthYear = totalPopulation / 1000 * (growth - mortality);
            totalPopulation = totalPopulation + growthYear;

            System.out.println("Год " + years + " численность населения составляет " + totalPopulation);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int contribution = 15_000;
        int month = 0;
        while (contribution < 12_000_000) {
            month = month + 1;
            contribution = contribution + (contribution / 100) * 7;
            System.out.println("Месяц " + month + " , сумма накоплений составляет " + contribution);

        }
        System.out.println("Для накопления 12 милионов рублей, потребуется " + month + " месяцев.");

    }

    public static void task5() {
        System.out.println("Задача 5");
        int contribution = 15_000;
        int month = 0;
        while (contribution < 12_000_000) {
            month = month + 1;
            contribution = contribution + (contribution / 100) * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений составляет " + contribution);

            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int contribution = 15_000;
        int years = 12 * 9;
        for (int i = 1; i <= years; i++) {
            contribution = contribution + (contribution / 100) * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накоплений " + contribution);

            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 6;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

    }

    public static void task8() {
        System.out.println("Задача 8");
        int yearNow = 2022;
        int yearsAgo200 = yearNow - 200;
        int yearsLater100 = yearNow + 100;
        for (int i = 0; i <= yearsLater100; i++){
            if (i % 79 == 0 && i >= yearsAgo200){
                System.out.println(i);
            }

        }

    }
}

