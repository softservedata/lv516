package com.softserve.edu15;

/**
 * @author Lv-516.JavaCore <br>
 *         Super class
 */
public class Appl {
    /*-
     * Here is a block comment with some very special
     * formatting that I want indent(1) to ignore.
     * one
     *      two
     *              three
     */

    /* *
     * @deprecated OLD METHOD.
     */
    @Deprecated
    public void m1() {
        System.out.println("Hello");
    }
    
    public static void main(String[] args) {
        /*-
         * Here is a block comment with some very special
         * formatting that I want indent(1) to ignore.
         * one
         *      two
         *              three
         */
        Appl app = new Appl();
        app.m1();
    }
}
