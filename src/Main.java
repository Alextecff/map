import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map <String, Car> hashMap = new HashMap();
        Map<String, Car> hashTable = new Hashtable();
        Map<String, Car> linkedHashMap = new LinkedHashMap();
        Map<Car, String> treeMap = new TreeMap();


        Car car = new Car("Ford", 2007, 12000);

        hashMap.put("zero", car);
        hashMap.put("one", new Car("KIA", 2000, 8000));
        hashMap.put("four", new Car("BMW", 1995, 15000));
        hashMap.put("three", new Car("LADA", 2015, 4000));
        hashMap.put("two", new Car("Opel", 2004, 11000));

        hashTable.put("zero", new Car("Ford", 2007, 12000));
        hashTable.put("one", new Car("KIA", 2000, 8000));
        hashTable.put("four", new Car("BMW", 1995, 15000));
        hashTable.put("three", new Car("LADA", 2015, 4000));
        hashTable.put("two", new Car("Opel", 2004, 11000));

        linkedHashMap.put("zero", new Car("Ford", 2007, 12000));
        linkedHashMap.put("one", new Car("KIA", 2000, 8000));
        linkedHashMap.put("four", new Car("BMW", 1995, 15000));
        linkedHashMap.put("three", new Car("LADA", 2015, 4000));
        linkedHashMap.put("two", new Car("Opel", 2004, 11000));

        treeMap.put(new Car("Opel", 2004, 11000), "two");
        treeMap.put(new Car("Ford", 2007, 12000), "zero");
        treeMap.put(new Car("KIA", 2000, 8000), "one");
        treeMap.put(new Car("BMW", 1995, 15000), "four");
        treeMap.put(new Car("LADA", 2015, 4000), "three");

        System.out.println("=====HashMap=====");
        for (String s : hashMap.keySet()) {
            System.out.println(hashMap.get(s));
        }

        System.out.println("=====HashTable=====");
        for (String s : hashTable.keySet()) {
            System.out.println(hashTable.get(s));
        }

        System.out.println("=====LinkedHashMap=====");
        for (String s : linkedHashMap.keySet()) {
            System.out.println(linkedHashMap.get(s));
        }

        System.out.println("=====TreeMap=====");
        for (Car c : treeMap.keySet()) {
            System.out.println(treeMap.get(c) + " : " + c.year);
        }
    }

}
