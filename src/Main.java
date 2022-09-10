public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 3.");
        int FirstGradeTeacher = 23;
        int SecondGradeTeacher = 27;
        int ThirdGradeTeacher = 30;
        int NumberSheetsPaper= 480;
        int NumberSheetsChildren = NumberSheetsPaper / (FirstGradeTeacher + SecondGradeTeacher + ThirdGradeTeacher);
        System.out.println("На каждого ученика рассчитано " + NumberSheetsChildren + " листов бумаги.");
    }
}