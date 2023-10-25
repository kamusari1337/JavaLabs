package queuePractice;

public class TaskFourthStudent {
    private String secondName;
    private int groupNumber;

    @Override
    public String toString() {
        return "{" + "secondName='" + secondName + '\'' +
                ", groupNumber=" + groupNumber +
                ", bdYear=" + bdYear + "}";
    }

    private int bdYear;

    public TaskFourthStudent(String secondName, int groupNumber, int bdYear) {
        this.secondName = secondName;
        this.groupNumber = groupNumber;
        this.bdYear = bdYear;
    }

    public int getBdYear() {
        return bdYear;
    }
}
