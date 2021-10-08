package com.github.java.concepts.basics.bits;

public class BitManipulation {
    /**
     * Set union A | B
     * Set intersection A & B
     * Set subtraction A & ~B
     * Set negation ALL_BITS ^ A or ~A
     * Set bit A |= 1 << bit
     * Clear bit A &= ~(1 << bit)
     * Test bit (A & 1 << bit) != 0
     * Extract last bit A&-A or A&~(A-1) or x^(x&(x-1))
     * Remove last bit A&(A-1)
     * Get all 1-bits ~0
     */

    public static void main(String[] args) {
        shiftOperation();
//        binaryStringConversation();
//        unionBits();
    }

    private static void shiftOperation() {
        int i = 2;
        int j = i >> 1;             /* right shift */
        System.out.println(i);
        System.out.println(j);

        j = i << 1;                 /* left shift */
        System.out.println(i);
        System.out.println(j);

    }

    private static void binaryStringConversation() {
        String binaryLong = Long.toBinaryString(1231);
        String binaryInteger = Integer.toBinaryString(123);
        String binaryString = Long.toString(34534534, 2);
    }

    private static void unionBits() {
    }
}
