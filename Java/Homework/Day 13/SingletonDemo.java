class Singleton {
    // Step 1: Create a private static variable to hold the single instance
    private static Singleton instance;

    // Step 2: Make the constructor private to prevent direct instantiation
    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    // Step 3: Provide a public method to return the instance
    public static Singleton getInstance() {
        if (instance == null) { // Create instance only if it does not exist
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        // Accessing Singleton instance
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        // Verifying both objects are the same instance
        System.out.println(obj1 == obj2); // Output: true
    }
}
