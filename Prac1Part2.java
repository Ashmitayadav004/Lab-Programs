package CollegeLabPrograms;

public class Prac1Part2 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Invalid no of arguments");
            return;
        }
        try {
            double num1 = Double.parseDouble(args[0]);
            char operator = args[1].charAt(0);
            double num2 = Double.parseDouble(args[2]);
            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.printf("Result of %f and %f is %f\n",num1,num2, result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.printf("Result of %f and %f  is %f\n",num1,num2, result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.printf("Result of %f and %f is %f\n",num1,num2, result);
                    break;
                case '/':
                    result = num1 / num2;
                    System.out.printf("Result of %f and %f  is %f\n",num1,num2, result);
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;

            }

        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }
}
