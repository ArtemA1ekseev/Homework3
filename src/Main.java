public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 5.");
        int WholeCansPaints = 120;
        int WhiteCansPaints = 2;
        int BrownCansPaints = 4;
        int NumberClasses = WholeCansPaints / (WhiteCansPaints + BrownCansPaints);
        int WhiteCansPaintsAll = NumberClasses * WhiteCansPaints;
        int BrownCansPaintsAll = NumberClasses * BrownCansPaints;
        System.out.println("В школе, где " + NumberClasses + " классов, нужно " + WhiteCansPaintsAll + " банок белой краски и " + BrownCansPaintsAll + " банок коричневой краски.");
    }
}