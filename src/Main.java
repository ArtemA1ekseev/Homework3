public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 4.");
        int Bottles = 16;
        int Minutes = 2;
        int TwentyMinutes = 20;
        int Performance = Bottles / Minutes;
        System.out.println("За " + TwentyMinutes + " минут машина произвела бутылок " + Performance * TwentyMinutes + " штук.");
        int MinInDay = 24 * 60;
        System.out.println("За " + MinInDay + " минут машина произвела бутылок " + Performance * MinInDay + " штук.");
        int MinInThreeDay = MinInDay * 3;
        System.out.println("За " + MinInThreeDay + " минут машина произвела бутылок " + Performance * MinInThreeDay + " штук.");
        int MinInMonth = 10 * MinInThreeDay;
        System.out.println("За " + MinInMonth + " минут машина произвела бутылок " + Performance * MinInMonth + " штук.");

    }
}