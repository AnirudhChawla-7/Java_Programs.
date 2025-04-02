package Q;

import p.A;

public class B {
    public static void main(String[] args) {
        A a = new A();
        
        a.publicmethod();
        // a.protectedmethod(); not accessible
        // a.defaultmethod(); not accessible
        // a.privatemethod(); not accessible
    }
}
