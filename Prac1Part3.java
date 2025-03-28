package CollegeLabPrograms;

public class Prac1Part3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Enter the number again");
            return;

        }
        int n;
        n = Integer.parseInt(args[0]);
        int first = 0, second = 1;
        System.out.println("Printing fibonacci : ");
        System.out.printf(first + " ");
        System.out.printf(second + " ");
        for (int i = 2; i < n; i++) {

            int nextterm = first + second;
            System.out.printf(nextterm + " ");
            first = second;
            second = nextterm;
        }
    }
}
