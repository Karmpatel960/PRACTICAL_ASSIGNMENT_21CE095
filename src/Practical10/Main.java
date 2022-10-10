package Practical10;

public class Main {
    public static void main(String[] args) {
        ComparableSquare s1 = new ComparableSquare(30);
        ComparableSquare s2 = new ComparableSquare(30);
        if(s1.compareTo(s2)>0){
            System.out.println("s1 is larger than s2");
        }
        else if(s1.compareTo(s2)<0){
            System.out.println("s2 is larger than s1");
        }
        else{
            System.out.println("s1 is equal to s2");
        }
        System.out.println("Prepared By PATEL KARM HITESHKUMAR(21CE095)");
    }
}
