public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int max = numbers[0];
        int min = numbers[0];

       for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] > max) {
               max = numbers[i];
           }
           if(numbers[i] < min) {
               min = numbers[i];
           }
       }

       System.out.println("Максимальное число: " + max + "\nМинимальное число: " + min);
    }
}