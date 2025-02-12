class Superclass {
    private int a = 7;

    public int a(){
        return a;
    }
}

class Derivedclass extends Superclass{
    void display(){
        System.out.println("Accessing private numer thorugh method: "+ a);
    }
}


public class Super_Class{
    public static void main(String[] args){
        Derivedclass obj = new Derivedclass();
        obj.display();
    }
}
