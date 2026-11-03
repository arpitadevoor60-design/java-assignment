
    class Complex {
        int real, imaginary;

        Complex(int r, int i) {
            real = r;
            imaginary = i;
        }

        Complex add(Complex c) {
            return new Complex(real + c.real,
                    imaginary + c.imaginary);
        }

        Complex multiply(Complex c) {
            return new Complex(
                    real * c.real - imaginary * c.imaginary,
                    real * c.imaginary + imaginary * c.real
            );
        }

        double magnitude() {
            return Math.sqrt(real * real + imaginary * imaginary);
        }

        Complex copy() {
            return new Complex(real, imaginary);
        }

        void display() {
            System.out.println(real + " + " + imaginary + "i");
        }
        public static void main(String[] args) {

            Complex c1 = new Complex(3, 2);
            Complex c2 = new Complex(2, 1);

            System.out.print("First number: ");
            c1.display();

            System.out.print("Second number: ");
            c2.display();

            Complex sum = c1.add(c2);
            System.out.print("Addition: ");
            sum.display();

            Complex product = c1.multiply(c2);
            System.out.print("Multiplication: ");
            product.display();

            System.out.println("Magnitude: " + c1.magnitude());

            Complex copy = c1.copy();
            System.out.print("Copied number: ");
            copy.display();
        }
    }
