public class ClassA1 {

   ClassA1(int x) {
        System.out.println("A constructor: " + x);
    }
}

class B extends ClassA1 {

    B(int x) {
        super(x + 10);
        System.out.println("B constructor: " + x);
    }
}

class C extends B {

    C(int x) {
        super(x + 20);
        System.out.println("C constructor: " + x);
    }
    public static void main(String[] args) {

        C obj = new C(10);
    }
}
