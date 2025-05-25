 package serialization;
 import java.io.*;
public class Serialization {
    public static void main(String[] args) {
//        Person p=new Person("Kanwal Adrees Khan",19);
//        try{
//            FileOutputStream fileOut=new FileOutputStream("Person.ser");
//            ObjectOutputStream obj=new ObjectOutputStream(fileOut);
//            obj.writeObject(p);
//            obj.close();
//            fileOut.close();
//            System.out.println("Object has been serialized!");
//        }catch(Exception e){
//            e.printStackTrace();
//        }
 Person p=null;
        try{
            FileInputStream fileIn=new FileInputStream("Person.ser");
            ObjectInputStream obj=new ObjectInputStream(fileIn);
            p=(Person)obj.readObject();
            obj.close();
            fileIn.close();
            System.out.println("Object has been Deserialized!");
               System.out.println(p.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
       
    }
}
