package MemoryManagement;

class Address implements Cloneable {
    String city;
    String street;

    Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy of Address object
    }

    @Override
    public String toString() {
        return "Address{city='" + city + "', street='" + street + "'}";
    }
}

class PersonDeepClone implements Cloneable {
    String name;
    int age;
    Address address; // Reference to another object

    PersonDeepClone(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Perform deep cloning by cloning the Address object as well
        PersonDeepClone clonedPerson = (PersonDeepClone) super.clone();
        clonedPerson.address = (Address) address.clone(); // Clone the address as well
        return clonedPerson;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address=" + address + "}";
    }
}

public class DeepCloneExample {
    public static void main(String[] args) {
        try {
            // Create an Address object
            Address address1 = new Address("New York", "5th Avenue");

            // Create a PersonDeepClone object
            PersonDeepClone person1 = new PersonDeepClone("John", 30, address1);
            System.out.println("Original: " + person1);

            // Clone the PersonDeepClone object (deep clone)
            PersonDeepClone person2 = (PersonDeepClone) person1.clone();
            System.out.println("Cloned: " + person2);

            // Modify the cloned object's Address
            person2.address.city = "Los Angeles";
            person2.address.street = "Sunset Blvd";

            System.out.println("After modification:");
            System.out.println("Original: " + person1);
            System.out.println("Cloned: " + person2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

