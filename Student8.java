class Student8 {

    private String usn;
    private String name;
    private int m1, m2, m3;

    static int count = 0;
    final int MAX_MARKS = 100;

    Student8(String usn, String name, int m1, int m2, int m3) {
        this.usn = usn;
        this.name = name;

        setMarks(m1, m2, m3);
        count++;
    }

    void setMarks(int a, int b, int c) {
        if (a >= 0 && a <= MAX_MARKS &&
                b >= 0 && b <= MAX_MARKS &&
                c >= 0 && c <= MAX_MARKS) {

            m1 = a;
            m2 = b;
            m3 = c;
        } else {
            System.out.println("Invalid marks!");
        }
    }

    int total() {
        return m1 + m2 + m3;
    }

    double average() {
        return total() / 3.0;
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    void display(boolean result) {
        display();
        System.out.println("Total: " + total());
        System.out.println("Average: " + average());
    }

    Student8 getSummary() {
        return new Student8(usn, name, m1, m2, m3);
    }

    public static void main(String[] args) {

        Student8 s1 = new Student8("101", "Akash", 85, 90, 80);

        System.out.println("Student Details:");
        s1.display(true);

        System.out.println("Students8 Created: " + count);

        Student8 s2 = s1.getSummary();

        System.out.println("Summary of Student:");
        s2.display(true);
    }
}

