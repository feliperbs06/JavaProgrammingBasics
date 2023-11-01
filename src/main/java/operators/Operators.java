package operators;

public class Operators {
    public static void main(String[] args) {
        short aShort = 1;
        int anInteger = 13;
        long aLong = 0xCAFEBABE;

        // assignments must be compatible
        anInteger = aShort;

//        aShort = aLong; // cannot do this--to wide
//        aShort = aShort + aLong; // nor this
        aShort = (short) aLong; // can 'cast' to force the assignment
        // notice lost precision in the cast
        System.out.println("The value of aShort is " + aShort);
        System.out.println("The value of aLong is " + aLong);

        // Major operators: Arithmetic
        anInteger = 64 + 64;
        System.out.println("anInteger is " + anInteger);
        anInteger = anInteger - 127;
        System.out.println("anInteger is " + anInteger);
        anInteger = anInteger * 100;
        System.out.println("anInteger is " + anInteger);
        anInteger = anInteger / 10;
        System.out.println("anInteger is " + anInteger);
        anInteger = anInteger % 4;
        System.out.println("anInteger is " + anInteger);

        // Increment and decrement
        System.out.println("anInteger++ gives " + anInteger++);
        System.out.println("anInteger is now " + anInteger);
        System.out.println("--anInteger gives " + --anInteger);

        System.out.println("Assignment value is " + (anInteger = 99));

        // Assignment operators: avoid casts, evaluate one
        anInteger += 99; // equivalent to anInteger = anInteger + 99;
        anInteger += aLong; // assignment operators include implied casts

        // Comparison operators return boolean results
        System.out.println("100 > 99 " + (100 > 99));
        System.out.println("100 < 99 " + (100 < 99));
        System.out.println("100 >= 99 " + (100 >= 99));
        System.out.println("100 <= 99 " + (100 <= 99));
        System.out.println("100 == 99 " + (100 == 99));
        System.out.println("100 != 99 " + (100 != 99));

    }
}
