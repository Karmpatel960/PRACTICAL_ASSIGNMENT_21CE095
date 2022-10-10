package Practical12;

class Obj1 {

    private String name;

    Obj1(String name) {

        this.name = name;
    }

    public String getObj1() {
        return this.name;
    }
}

class Obj2 {
    private String name;

    Obj2(String name) {
        this.name = name;
    }

    public String getObj2() {
        return this.name;
    }
}

public class Association {
    public static void main(String[] args) {
        Obj1 a = new Obj1("OBJECT1");
        Obj2 b = new Obj2("OBJECT2");
        System.out.println(b.getObj2() + " is Same as " + a.getObj1());
    }
}

