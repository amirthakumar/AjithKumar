package in.vamsoft.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    
    Employee emp=new Employee("Ajith", 21);
    ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("Object.txt"));
    objectOutputStream.writeObject(emp);
    System.out.println("Object Written");
    objectOutputStream.close();
    
    ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("Object.txt"));
    Employee emp1=(Employee)objectInputStream.readObject();
    System.out.println(emp1);
    objectInputStream.close();
  }
}
