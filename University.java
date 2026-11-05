class University {
    String UniversityName = "VTU";

    static class Department {
        String DepartmentName = "Data Science";

        void display() {
            System.out.println("Department:" + DepartmentName);
        }
    }

    class Faculty {
        String FacultyName = "Professor";
        String Designation = "Lecture";

        void display() {
            System.out.println("FacultyName:" + FacultyName);
            System.out.println("Designation:" + Designation);
        }
    }

    void displayUniversity() {
        System.out.println("UniversityName:" + UniversityName);
    }
    public static void main(String[] args)
    {
        University u=new University();
        University.Department d=new University.Department();
        University.Faculty f=u.new Faculty();
        u.displayUniversity();
        d.display();
        f.display();
    }
}

