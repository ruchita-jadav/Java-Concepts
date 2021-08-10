package com.github.java.concepts.basics.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeObject {

    String serialize(Object object) {
        String fileName = null;
        try {
            fileName = object.getClass().getName() + ".txt";
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
        return fileName;
    }
}
