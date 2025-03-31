class TOH {
    static void toh(int n, char source, char inter, char destination) {
        System.out.println("m is " + n + " | Source: " + source + " | Intermediate: " + inter + " | Destination: " + destination);
        
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
        } else {
            System.out.println("Calling toh(" + (n - 1) + ", " + source + ", " + destination + ", " + inter + ")");
            toh(n - 1, source, destination, inter);  // Move n-1 disks from source to intermediate
            
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            
            System.out.println("Calling toh(" + (n - 1) + ", " + inter + ", " + source + ", " + destination + ")");
            toh(n - 1, inter, source, destination);  // Move n-1 disks from intermediate to destination
        }
    }

    public static void main(String[] args) {
        int m = 3; // Number of disks
        toh(m, 'A', 'B', 'C'); // Call TOH function
    }
}
