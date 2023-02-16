package Week6;

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

        return dept + "-" + courseNum + " for " + courseHrs + " credit hours";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Course) {
            Course otherCourse = (Course) obj;
            return dept.equals(otherCourse.dept) &&
                    courseNum == otherCourse.courseNum &&
                    courseHrs == otherCourse.courseHrs;
        } else return false;
    }
}
