package MemoryManagement;

public class Main {
    public static void main(String[] args) {
        try{
            Person person1 = new Person(15,"Pratik");
            System.out.println("Original"+ person1);

            Person person2 = (Person) person1.clone();
            System.out.println("Cloned"+ person2);

            person2.age = 23;
            person2.name = "Mrunal";

            System.out.println("After modification:");
            System.out.println("Original: " + person1);
            System.out.println("Cloned: " + person2);

        } catch (CloneNotSupportedException  e) {
            e.getMessage();
        }
    }
}
