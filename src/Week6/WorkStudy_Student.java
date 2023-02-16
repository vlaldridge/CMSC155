package Week6;

import java.text.DecimalFormat;

public class WorkStudy_Student extends Student{
    private double hours_worked = 0;

    public WorkStudy_Student(String name, int numID, double hours_worked) {
        super(name, numID);
        this.hours_worked = hours_worked;
    }

    public WorkStudy_Student(String name, double hours_worked) {
        super(name);
        this.hours_worked = hours_worked;
    }

    public void addHours (double hours) {
        hours_worked += hours;
    }

    public String toString() {
        DecimalFormat moneyFormat = new DecimalFormat("###,###.##");
        String out = super.toString() + "They are a work-study student and have earned $" +
                moneyFormat.format(hours_worked * 7.75) + "\n";
        return out;
    }

}
