package com.github.java.concepts.basics.serialization;

import java.io.*;

public class DeserializeObject {

    Object deserialize(String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return objectInputStream.readObject();
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getStackTrace());
        }
        return null;
    }
}
