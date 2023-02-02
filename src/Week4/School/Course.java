package Week4.School;

public class Course {
    private String dept;
    private int courseNum;
    private int courseHrs;

    public Course(String dept, int courseNum, int courseHrs) {
        this.dept = dept;
        this.courseNum = courseNum;
        this.courseHrs = courseHrs;
    }

    public String toString() {

        return dept + "-" + courseNum + " is " + courseHrs + " credit hours.";
    }
}
