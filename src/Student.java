import java.util.Objects;

public class Student implements Comparable<Student>{

    public Student(int id, String name) {
        this.id = id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private String name;

    @Override
    public int compareTo(Student s) {
        if(id == s.id) {
            return 0;
        } else if(id > s.id) {
            return 1;
        } else {
             return -1;
        }
    }
}
