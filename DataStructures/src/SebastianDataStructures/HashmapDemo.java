package SebastianDataStructures;

interface A {
    public Number play();
}

abstract class B {
    public Long play() {
        return 3L;
    }
}
public class HashmapDemo extends B implements A{
    public Long play() {
        return 12;
    }
    public static void main(String[] args) {

       System.out.println(play());

    }
}
