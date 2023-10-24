
class alpha{
    void alpha()
    {
        System.out.println("Alpha");
        alpha();
        // stack overflow error which occurs at runtime.
        // exceptions can be handled but errors we can't.
    }
}

public class laucheh4 {
    public static void main(String[] args) {
        alpha a = new alpha();
        a.alpha();
    }
}
