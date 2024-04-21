package ai.verisoft.creational;

public class Example {
    int a;
    int b;
    String c;
    Object o;
    double d;
    int f;

    public Example(int a, int b, String c, Object o, double d, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.o = o;
        this.d = d;
        this.f = f;
    }


    public static void main(String[] args) {
        Example e = new Example(1, 2, "3", new Object(), 4.0, 5);
        System.out.println(e.a);
        System.out.println(e.b);
        System.out.println(e.c);
        System.out.println(e.o);
        System.out.println(e.d);
        System.out.println(e.f);
    }
}
