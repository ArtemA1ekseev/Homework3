public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 7.");
        int NeedResetKg = 7;
        int NeedResetGram = 7 * 1000;
        int WeightLoss1 = 250;
        int WeightLoss2 = 500;
        int QuantityFirstCase = NeedResetGram / WeightLoss1;
        System.out.println( QuantityFirstCase + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        int QuantitySecondCase = NeedResetGram / WeightLoss2;
        System.out.println( QuantitySecondCase + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        int AverageAmountGram = (WeightLoss1 + WeightLoss2) / 2;
        int AverageDays = NeedResetGram / AverageAmountGram;
        System.out.println(AverageDays + " дней уйдёт в среднем, чтобы добиться результата похудения.");
    }
}