package conditions;

public class Conditions {
    public static void main(String[] args) {
        int a = 98;
        int b = 100;

        if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is greater than " + b);
        }

        switch (a) {
            case 98:
            case 99:
                System.out.println("a is 98 or 99");
                break;
            case 100:
                System.out.println("a is 100");
                break;
            default:
                System.out.println("a is something else");
                break;
        }

    }
}
