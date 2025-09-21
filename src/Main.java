import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList<String>();
        List<String> a2 = new ArrayList<>();
        a1.add("x");
        a2.add("y");
       // System.out.println(a1+" " +a2);

        //Set<Student> students = new HashSet<>();
        List<Student> students = new ArrayList<>();
        Student s1= new Student(3,"Pratik");
        Student s2= new Student(3,"Pratiksha");
        Student s3= new Student(2,"Akshay");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        //Collections.sort(students);
        //Collections.sort(students, new IdComparator());
        //Collections.sort(students, new NameComparator());
        //Iterator<Student> it= students.iterator();
        //while(it.hasNext()) {
            //System.out.println(it.next());
        //}
        //System.out.println(students);

        Map<Integer, String> map = new TreeMap<>();
        map.put(1,"a");
        map.put(2,"c");
        map.put(4,"x");
        map.put(3,"g");
        System.out.println(map);
    }
}