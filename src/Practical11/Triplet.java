package Practical11;

public class Triplet<T, T1, T2> {
    private T first;
    private T1 second;
    private T2 third;

    Triplet(T first, T1 second, T2 third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "[" + first + "," + second + "," + third + "]";
    }
}
