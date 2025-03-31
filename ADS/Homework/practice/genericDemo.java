public class GenericDemo<T> {
    private Node<T> head;

    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(T data) {
        Node<T> new_node = new Node<>(data);
        new_node.next = head;
        head = new_node;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }
        head = head.next;
    }

    public void forEach(Consumer<T> action) {
        Node<T> current = head;
        while (current != null) {
            action.accept(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        GenericDemo<Student> studentList = new GenericDemo<>();
        studentList.addFirst(new Student(13, "CDAC"));
        studentList.addFirst(new Student(14, "Isha"));
        studentList.addFirst(new Student(15, "Janhvi"));

        studentList.forEach(System.out::println);
    }
}

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

// @FunctionalInterface
// interface Consumer<T> {
//     void accept(T t);
// }
