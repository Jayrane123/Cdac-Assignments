package Assignment4;

public class Student {
    
    private String name;
    private int marks1, marks2, marks3;
    
   
    public void setDetails(String name, int marks1, int marks2, int marks3){
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int getTotalMarks() {        
        return marks1 + marks2 + marks3;
    }

    public double getAverageMarks() {
        return getTotalMarks() / 3.0;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Average Marks: " + getAverageMarks());
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setDetails("Jay Prakash", 89, 90, 98);
        
        Student student2 = new Student();
        student2.setDetails("Abhay", 75, 88, 92);
        
        System.out.println("**** Student 1 Details ****");
        student1.display();

        System.out.println("\n**** Student 2 Details ****");
        student2.display();
    }
}
