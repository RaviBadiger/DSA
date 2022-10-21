package datastructures.hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.set("nails",100);
        hashtable.set("tile",50);
        hashtable.set("lumber",80);
        hashtable.set("bolts",200);
        hashtable.set("screws",140);
        hashtable.printTable();
        System.out.println(hashtable.get("screw"));
        System.out.println(hashtable.keys());

    }
}
