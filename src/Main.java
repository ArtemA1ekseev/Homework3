public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 6.");
        int WeightOneBananas = 80;
        int QuantityBananas = 5;
        int GramProductBananas = QuantityBananas * WeightOneBananas;
        int WeightOneMilk = 105;
        int QuantityMilk = 200;
        int GramProductMilk = WeightOneMilk * (QuantityMilk / 100);
        int WeightOneIceCream = 100;
        int QuantityIceCream = 2;
        int GramProductIceCream = QuantityIceCream * WeightOneIceCream;
        int WeightOneEggs = 70;
        int QuantityEggs = 4;
        int GramProductEggs = QuantityEggs * WeightOneEggs;
        int FinalWeightProduct = GramProductBananas + GramProductMilk + GramProductIceCream + GramProductEggs;
        int grPerKg = 1000;
        float weightKg = FinalWeightProduct/(float)grPerKg;
        System.out.println("Общий вес спорт-завтрака - " + weightKg + " кг.");
    }
}