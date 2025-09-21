public class Generics<T> {
    T value;

    void printObject(T value) {
        System.out.println(value);
    }
}


class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


class Main1 {
    public static void main(String args[]) {
        Generics<Integer> x= new Generics<>();
        x.printObject(1);

        Generics<String> y= new Generics<>();
        y.printObject("Pratik");

        Generics<Employee> z= new Generics<>();
        z.printObject(new Employee(1,"Pratik"));
    }
}
