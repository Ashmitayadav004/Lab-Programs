package CollegeLabPrograms;

public class CoomandLine {
    public static void main(String[] args) {
        if (args.length < 1) {
            return;
        }
        String name = args[0];
        System.out.println(name);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
