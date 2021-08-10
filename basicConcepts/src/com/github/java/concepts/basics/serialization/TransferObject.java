package com.github.java.concepts.basics.serialization;

import java.io.Serializable;

/**
 * Intellij IDEA Settings
 * File -> Settings -> Editor -> Inspections -> Java -> Serialization issues:
 * <p>
 * Find "serialization class without serialVersionUID" and check it.
 * <p>
 * Back to the editor, clicks on the class name, OPTION + ENTER (Mac), it will prompts the Add serialVersionUID field option.
 */
public class TransferObject implements Serializable {

    private static final long serialVersionUID = 1965247371237797073L;
//    private static final long serialVersionUID = 1L;

    int i ;

    int j ;

    public TransferObject(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void print() {
        System.out.println("i - " + i + "& j- " + j);
    }
}
