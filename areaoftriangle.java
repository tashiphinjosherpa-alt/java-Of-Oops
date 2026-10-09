import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        float a, b, c, sp;
        double area;

        System.out.println("Enter values for the sides of the triangle:");

        Scanner r = new Scanner(System.in);

        a = r.nextInt();
        b = r.nextInt();
        c = r.nextInt();

        sp = (a + b + c) / 2;

        area = Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));

        System.out.println("Area of triangle is " + area);
    }
}
