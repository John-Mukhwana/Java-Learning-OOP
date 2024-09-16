package classquiz;


/*Using Examples write a Java Program to use "this" keyword */
public class Assignment1this {
    int a;
    int b;

    Assignment1this(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        Assignment1this obj = new Assignment1this(10, 20);
        obj.display();
    }
} 