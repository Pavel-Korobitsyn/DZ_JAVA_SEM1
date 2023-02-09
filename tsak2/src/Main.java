import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите год: ");
        Scanner iScanner = new Scanner(System.in);
        int year = iScanner.nextInt();

        if (checkLeapYear(year)){
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }

    public static boolean checkLeapYear (int year){
        if (year % 400 == 0){
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }

    }
}
