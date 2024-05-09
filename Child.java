import java.io.*;

class MyClass implements Serializable {
    private String normalField; // This field will be serialized
    private transient String transientField; // This field will NOT be serialized

    public MyClass(String normalField, String transientField) {
        this.normalField = normalField;
        this.transientField = transientField;
    }

    public String getNormalField() {
        return normalField;
    }

    public String getTransientField() {
        return transientField;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "normalField='" + normalField + '\'' +
                ", transientField='" + transientField + '\'' +
                '}';
    }
}

public class Child {
    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass obj = new MyClass("Normal Value", "Transient Value");

        try {
            // Serialize the object
            FileOutputStream fileOut = new FileOutputStream("serializedObject.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            System.out.println("Object serialized and saved as serializedObject.ser");

            // Deserialize the object
            FileInputStream fileIn = new FileInputStream("serializedObject.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            MyClass deserializedObj = (MyClass) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Object deserialized: " + deserializedObj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
