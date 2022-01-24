package com.nit.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.nit.sdp.Printer3;

public class SingletonClassSerializationAndDeSerializationTest3 {

	public static void doSerialization(Object obj) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"))){
			oos.writeObject(obj);  //Serialization
			oos.flush();
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Object Serialization is done");
	}//method

	public static Object doDeSerialization() {
		Object p = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))){
			p = (Object) ois.readObject();	  //DeSerialization
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	public static void main(String[] args) {
		/*//Get Singleton java class object
		Printer p1 = Printer.getInstance();
		//Perform Serialization on the single object of singleton class
		doSerialization(p1);
		System.out.println("---------------------------------------------------");
		Printer p2 = (Printer) doDeSerialization();
		Printer p3 = (Printer) doDeSerialization();
		System.out.println(p1.hashCode()+" "+p2.hashCode()+" "+p3.hashCode());*/

		/*//Get Singleton java class object
		Printer2 p1 = Printer2.getInstance();
		//Perform Serialization on the single object of singleton class
		doSerialization(p1);
		System.out.println("---------------------------------------------------");
		Printer2 p2 = (Printer2) doDeSerialization();
		Printer2 p3 = (Printer2) doDeSerialization();
		System.out.println(p1.hashCode()+" "+p2.hashCode()+" "+p3.hashCode());*/

		//Get Singleton java class object
		Printer3 p1 = Printer3.getInstance();
		//Perform Serialization on the single object of singleton class
		doSerialization(p1);
		System.out.println("---------------------------------------------------");
		Printer3 p2 = (Printer3) doDeSerialization();
		Printer3 p3 = (Printer3) doDeSerialization();
		System.out.println(p1.hashCode()+" "+p2.hashCode()+" "+p3.hashCode());
	}//main
}//class