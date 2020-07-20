package com.softserve.edu9;

public class AppStr {
    public static void main(String[] args) {
        /*-
        char[] chA = { 'A', 'B', 'C', 'D', 'E', 'F' };
        System.out.println(chA.length);
        String strThird = new String(chA);
        System.out.println("strThird = " + strThird);
        String strFourth = new String(chA, 2, 4); // CDEF
        System.out.println("strFourth = " + strFourth);
        //
        String str = "I study Java Kava language рст";
        int n = str.indexOf("ava");
        //System.out.println("n = " + n);
        char c = str.charAt(8);
        //System.out.println("c = " + c);
        //
        String str1 = str.substring(13);     // Kava language
        System.out.println("str1 = " + str1);
        str1 = str1.toUpperCase();
        System.out.println("new str1 = " + str1);
        String str2 = str.substring(8, 13);
        //System.out.println("str2 = " + str2);
        //
        String str = "\t\t   Tabulated String  \t\n\n";
        System.out.println(str);
        str = str.trim();
        System.out.println(str);
        //
        String str = "abracadabra";
        System.out.println(str);
        // str = str.replace("a", "--");
        str = str.replaceFirst("a", "--");
        System.out.println(str);
        str = ""; // null
        System.out.println("str.isEmpty() = " + str.isEmpty());
        */
        String a = "a"; // What will be the results?
        String A = "A";
        String b = "a";
        System.out.println("a.equals(A) " + a.equals(A));
        System.out.println("a.equals(b) " + a.equals(b));
        System.out.println("a.equalsIgnoreCase(A) " + a.equalsIgnoreCase(A));
        System.out.println("a.compareTo(A) " + a.compareTo(A));
        System.out.println("a.compareToIgnoreCase(A) " + a.compareToIgnoreCase(A));

    }
}
