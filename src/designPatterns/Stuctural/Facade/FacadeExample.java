package designPatterns.Stuctural.Facade;

// Complex Subsystems
class CPU {
    void start() { System.out.println("CPU Started"); }
}
class Memory {
    void load() { System.out.println("Memory Loaded"); }
}

// Facade
class Computer {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();

    public void startComputer() {
        cpu.start();
        memory.load();
        System.out.println("Computer Started");
    }
}

// Client
public class FacadeExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }
}

