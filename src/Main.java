public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 8.");
        int MashaMonth = 67760;
        double MashaMonthNew = MashaMonth + (MashaMonth * 0.1);
        double MashaGrowthYear = (MashaMonthNew - MashaMonth) * 12;
        System.out.println ("Маша теперь получает " + MashaMonthNew + " рублей. Годовой доход вырос на " + MashaGrowthYear + " рублей.");
        int DenisMonth = 83690;
        double DenisMonthNew = DenisMonth + (DenisMonth * 0.1);
        double DenisGrowthYear = (DenisMonthNew - DenisMonth) * 12;
        System.out.println ("Денис теперь получает " + DenisMonthNew + " рублей. Годовой доход вырос на " + DenisGrowthYear + " рублей.");
        int KristinaMonth = 76230;
        double KristinaMonthNew = KristinaMonth + (KristinaMonth * 0.1);
        double KristinaGrowthYear = (KristinaMonthNew - KristinaMonth) * 12;
        System.out.println ("Кристина теперь получает " + KristinaMonthNew + " рублей. Годовой доход вырос на " + KristinaGrowthYear + " рублей.");
    }
}