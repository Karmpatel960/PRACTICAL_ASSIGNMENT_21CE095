package Practical12;
class Object1 {

    private String name;

    Object1(String name) {

        this.name = name;
    }

    public String getObject1() {
        return this.name;
    }
}

class Object2 {
    private String name;

    Object2(String name) {
        this.name = name;
    }

    public String getObject2() {
        return this.name;
    }
}

class Object3 {
    private String name;

    Object3(String name){
        this.name = name;
    }

    public String getObject3() {
        return this.name;
    }
}

public class Transition {
    public static void main(String[] args) {
        Object1 a = new Object1("OBJECT1");
        Object2 b = new Object2("OBJECT2");
        Object3 c = new Object3("OBJECT3");
        System.out.println("["+a.getObject1() + "," + b.getObject2()+ "," +c.getObject3() + "]");
    }
}
