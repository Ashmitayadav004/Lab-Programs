package CollegeLabPrograms;

public class WrapperClassDemo {

    public static void main(String[] args) {
        // Demonstrating Integer wrapper class
        System.out.println("=== Integer Wrapper Class ===");
        int primitiveInt = 42;
        Integer wrappedInt = Integer.valueOf(primitiveInt); // Boxing
        System.out.println("Wrapped Integer: " + wrappedInt);

        // Converting String to Integer
        String intString = "123";
        Integer parsedInt = Integer.parseInt(intString);
        System.out.println("Parsed Integer from String: " + parsedInt);

        // Getting the maximum and minimum values
        System.out.println("Max Integer Value: " + Integer.MAX_VALUE);
        System.out.println("Min Integer Value: " + Integer.MIN_VALUE);

        // Demonstrating Double wrapper class
        System.out.println("\n=== Double Wrapper Class ===");
        double primitiveDouble = 3.14;
        Double wrappedDouble = Double.valueOf(primitiveDouble); // Boxing
        System.out.println("Wrapped Double: " + wrappedDouble);

        // Converting String to Double
        String doubleString = "45.67";
        Double parsedDouble = Double.parseDouble(doubleString);
        System.out.println("Parsed Double from String: " + parsedDouble);

        // Getting the maximum and minimum values
        System.out.println("Max Double Value: " + Double.MAX_VALUE);
        System.out.println("Min Double Value: " + Double.MIN_VALUE);

        // Demonstrating Character wrapper class
        System.out.println("\n=== Character Wrapper Class ===");
        char primitiveChar = 'A';
        Character wrappedChar = Character.valueOf(primitiveChar); // Boxing
        System.out.println("Wrapped Character: " + wrappedChar);

        // Character methods
        System.out.println("Is 'A' a letter? " + Character.isLetter(wrappedChar));
        System.out.println("Is '1' a digit? " + Character.isDigit('1'));
        System.out.println("Uppercase of 'a': " + Character.toUpperCase('a'));

        // Demonstrating Boolean wrapper class
        System.out.println("\n=== Boolean Wrapper Class ===");
        boolean primitiveBoolean = true;
        Boolean wrappedBoolean = Boolean.valueOf(primitiveBoolean); // Boxing
        System.out.println("Wrapped Boolean: " + wrappedBoolean);

        // Converting String to Boolean
        String trueString = "true";
        String falseString = "false";
        Boolean parsedTrue = Boolean.parseBoolean(trueString);
        Boolean parsedFalse = Boolean.parseBoolean(falseString);
        System.out.println("Parsed Boolean from String 'true': " + parsedTrue);
        System.out.println("Parsed Boolean from String 'false': " + parsedFalse);

        // Checking if a string can be parsed to Boolean
        String invalidBooleanString = "yes";
        Boolean parsedInvalid = Boolean.parseBoolean(invalidBooleanString);
        System.out.println("Parsed Boolean from String 'yes': " + parsedInvalid);

        // Demonstrating Byte wrapper class
        System.out.println("\n=== Byte Wrapper Class ===");
        byte primitiveByte = 10;
        Byte wrappedByte = Byte.valueOf(primitiveByte); // Boxing
        System.out.println("Wrapped Byte: " + wrappedByte);
        System.out.println("Max Byte Value: " + Byte.MAX_VALUE);
        System.out.println("Min Byte Value: " + Byte.MIN_VALUE);

        // Demonstrating Short wrapper class
        System.out.println("\n=== Short Wrapper Class ===");
        short primitiveShort = 1000;
        Short wrappedShort = Short.valueOf(primitiveShort); // Boxing
        System.out.println("Wrapped Short: " + wrappedShort);
        System.out.println("Max Short Value: " + Short.MAX_VALUE);
        System.out.println("Min Short Value: " + Short.MIN_VALUE);

        // Demonstrating Long wrapper class
        System.out.println("\n=== Long Wrapper Class ===");
        long primitiveLong = 100000L;
        Long wrappedLong = Long.valueOf(primitiveLong); // Boxing
        System.out.println("Wrapped Long: " + wrappedLong);
        System.out.println("Max Long Value: " + Long.MAX_VALUE);
        System.out.println("Min Long Value: " + Long.MIN_VALUE);

        // Demonstrating Float wrapper class
        System.out.println("\n=== Float Wrapper Class ===");
        float primitiveFloat = 5.75f;
        Float wrappedFloat = Float.valueOf(primitiveFloat); // Boxing
        System.out.println("Wrapped Float: " + wrappedFloat);
        System.out.println("Max Float Value: " + Float.MAX_VALUE);
        System.out.println("Min Float Value: " + Float.MIN_VALUE);
    }
}
