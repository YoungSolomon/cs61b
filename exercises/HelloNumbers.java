
public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        System.out.print("This program will output the cumulative sum of every number from 0 to 9. \n");
        while (x < 10) {
            sum += x;
            System.out.print(sum + " ");
            x++;
        }

        System.out.print("\n");
    }
}
