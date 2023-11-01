package variables;

public class Variables {
    public static void main(String[] args) {
        // numeric values, all signed
        // Notice naming convention fro variables
        byte aByte = 127; // behaves like 8 bits
        short aShort = 037654; // behaves like 16 bits
        int anInteger = 123456; // behaves like 32 bits
        long aLong = 0xCAFE; // behaves like 64 bits

        // floating poit numbers
        float aFloat = 99.9F;
        double aDouble = 98.0E+99;

        // unsigned number, represents a character
        // coded using Unicode
        char aCharacter = 'A'; // behaves like 16 bits
        aCharacter = '\u0041'; // hexadecimal literal
        aCharacter = '\n'; // newline

        // logical value; true or false
        boolean aBoolean = true; // // behaves like one bit

    }
}
