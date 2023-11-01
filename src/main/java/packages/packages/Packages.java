package packages.packages;

import packages.otherpackages.MyClass;

import java.util.Date;

public class Packages {
    public static void main(String[] args) {
//        java.util.Date today = new java.util.Date();
        Date today = new Date();
        System.out.println("Today is " + today);

        MyClass mc = new MyClass();
        System.out.println("object of MyClass says: " + mc);
    }
}
