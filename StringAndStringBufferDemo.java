package CollegeLabPrograms;
public class StringAndStringBufferDemo {
    public static void main(String[] args) {
        // Demonstrating String class
        System.out.println("=== String Class ===");
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String concatenatedString = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenatedString);

        // String length
        System.out.println("Length of str1: " + str1.length());

        // Accessing characters
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // Substring
        String substring = str1.substring(1, 4);
        System.out.println("Substring of str1 (1, 4): " + substring);

        // String comparison
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals 'Hello': " + str1.equals("Hello"));

        // Converting to uppercase
        System.out.println("str1 in uppercase: " + str1.toUpperCase());

        // String immutability
        String str3 = str1.replace('H', 'J');
        System.out.println("Original str1: " + str1);
        System.out.println("Modified str3: " + str3);

        // Demonstrating StringBuffer class
        System.out.println("\n=== StringBuffer Class ===");
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Appending
        stringBuffer.append(" World");
        System.out.println("Appended StringBuffer: " + stringBuffer);

        // Inserting
        stringBuffer.insert(5, ",");
        System.out.println("Inserted StringBuffer: " + stringBuffer);

        // Reversing
        stringBuffer.reverse();
        System.out.println("Reversed StringBuffer: " + stringBuffer);

        // Deleting
        stringBuffer.delete(0, 5);
        System.out.println("Deleted first 5 characters: " + stringBuffer);

        // Capacity and length
        System.out.println("Capacity of StringBuffer: " + stringBuffer.capacity());
        System.out.println("Length of StringBuffer: " + stringBuffer.length());

        // Converting StringBuffer to String
        String convertedString = stringBuffer.toString();
        System.out.println("Converted String from StringBuffer: " + convertedString);
    }
}