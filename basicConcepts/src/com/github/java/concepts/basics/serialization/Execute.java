package com.github.java.concepts.basics.serialization;

public class Execute {
    public static void main(String[] args) {
        //Point  : Serialized
        SerializeObject serializeObject = new SerializeObject();
        TransferObject transferObject = new TransferObject(1, 2);
        String fileName = serializeObject.serialize(transferObject);

        //Point : Deserialized
        DeserializeObject deserializeObject = new DeserializeObject();
        TransferObject transferObjectDeserial = (TransferObject) deserializeObject.deserialize(fileName);

        //Point : verified
        assertEqual(transferObject, transferObjectDeserial);
    }

    private static void assertEqual(TransferObject transferObject, TransferObject transferObjectDeserial) {
        if (transferObject.i != transferObjectDeserial.i ||
                transferObject.j != transferObjectDeserial.j
        ) {
            System.out.println("Objects are not equal.");
            return;
        }
        transferObject.print();
        transferObjectDeserial.print();
    }
}
