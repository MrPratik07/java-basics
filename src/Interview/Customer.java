package Interview;

public class Customer {
    String name;
    String State;
    double salary;

    public Customer(String name, String state, double salary) {
        this.name = name;
        this.State = state;
        this.salary =salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", State='" + State + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
