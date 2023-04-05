class A {
    public A() {

    }
}

class B extends A{
    public B () {

    }
}

public class Main2 {
    static void testMethod() throws Exception {
        String test = null;
        test.toString();
    }
    static void temp() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }
    public static void main(String[] args) throws Exception {
        temp();
    }
}
