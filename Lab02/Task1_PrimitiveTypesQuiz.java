public class Task1_PrimitiveTypesQuiz {
    public static void main(String[] args) {
        // what will be printed to the console after this program runs:
        System.out.println("'a' + 'A' = " + ('a' + 'A')); // 97 + 65 = 162
        System.out.println("\n");
        System.out.println("what will be the result of this addition? " + 1 + 2 + 3); // "what will be... 123"
        System.out.println(1 + 2 + 3 + " and what the result will be here?"); // "6 and what..."
        System.out.println("what will be the result of this addition? " + (1 + 2 + 3)); // "what will be... 6"
        
        boolean boolExample = !(true);
        System.out.println("boolExample = " + boolExample); // false
        
        // byte data type, so 8 bit integer
        byte by = (byte)135;
        System.out.println("byte 135 = " + by); // -121 (overflow)
        
        byte bySecond = (byte)256;
        System.out.println("byte 256 = " + bySecond); // 0 (overflow)
        
        // why is there a mistake here?
        // int i = 12345678901234567; // Error: integer number too large (exceeds int range)
        
        // why is there a mistake here?
        // long lg = 12345678901234567; // Error: needs 'L' suffix for long literal
        long lg = 12345678901234567L; // Correct way
        System.out.println("long value = " + lg);
        
        // what's going on here - hexadecimal and octal representation of 'm'
        char c = 0x6d;  // hexadecimal for 109 = 'm'
        char d = 0155;  // octal for 109 = 'm'
        System.out.println(c + " = " + d); // m = m
        
        // floating point precision issue
        double test = 2.0 - 1.9;
        System.out.println("2.0 - 1.9 = " + test); // Not exactly 0.1 due to floating point precision
        
        // integer overflow demonstration
        int a = 100000000;
        System.out.println("Here the variable has a value: " + a);
        a += 100000000;
        System.out.println("Here the variable has a value: " + a);
        a += 100000000;
        System.out.println("Here the variable has a value: " + a);
        a += 100000000;
        System.out.println("Here the variable has a value: " + a); // Overflow occurs here
    }
}

