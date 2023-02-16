package Week6;

public class CG_Course extends Course{
    private String location;

    public CG_Course(String dept, int courseNum, int courseHrs, String location) {
        super(dept, courseNum, courseHrs);
        this.location = location;
    }

    public String toString() {
        String out = super.toString() + " Class is held in " + location + ".";
        return out;
    }
}
