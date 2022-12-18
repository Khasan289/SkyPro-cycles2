public class Main {
    public static void main(String[] args) {
        task1();


        }
        public static void task1() {
        System.out.println("Задача 1");
        int accumulation = 29_000;
        float total = 0f;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

    }

}


