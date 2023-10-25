package queuePractice;

public class TaskFifthTriple {
    double first;
    double second;
    double third;

    public TaskFifthTriple(double first, double second, double third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }

    public boolean allValuesLessThanOrEqualTo(double value) {
        return first <= value && second <= value && third <= value;
    }
}
