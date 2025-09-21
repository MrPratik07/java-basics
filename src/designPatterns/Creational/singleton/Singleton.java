package designPatterns.Creational.singleton;


// one more example of Singleton pattern


class Singleton {
    private static Singleton instance;

    private Singleton() {} // Private constructor prevents direct instantiation

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class SingletonExample {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1 == obj2); // Output: true (same instance)
    }
}
