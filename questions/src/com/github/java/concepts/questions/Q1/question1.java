package com.github.java.concepts.questions.Q1;
/**
 * This is giving error
 */
/*
import com.github.java.concepts.questions.Q1.Math;
import com.github.java.concepts.questions.Q1.subpackage.Math;
 */

/**
 * These both are working and it will call mathod from Math class which is imported.
 */

/*
import com.github.java.concepts.questions.Q1.Math;
import com.github.java.concepts.questions.Q1.subpackage.*;
*/
/*
import com.github.java.concepts.questions.Q1.*;
import com.github.java.concepts.questions.Q1.subpackage.Math;
*/

public class question1 {
    public static void main(String[] args) {
        System.out.println(Math.print(2));
    }
}
