
    class Student1{
        String name;
        int age;

        void study()
        {
            System.out.println(name + "is studying");
        }

        void displaydetails()
        {
            System.out.println("name:" + name);
            System.out.println("age:" + age);
        }
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "arpita";
        s1.age = "19";
        s1.displaydetails();
    }
}