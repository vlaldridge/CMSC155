package Week6;

import java.util.ArrayList;

public class Student {
    private String name;
    private int numID;
    private static int nextID = 1;
    private ArrayList<Course> classList = new ArrayList<>();

    public Student(String name, int numID) {
        this.name = name;
        this.numID = numID;
    }

    public Student(String name) {
        this.name = name;
        numID = nextID;
        nextID++;
    }

    public void addClass(Course newCourse) {
        if (!classList.contains(newCourse) && classList.size() < 4) {
            classList.add(newCourse);
        }
    }

    public void removeClass(Course oldCourse) {
        if (classList.contains(oldCourse)) {
            classList.remove(oldCourse);
        }
    }

    public void changeName(String newName) {
        name = newName;
    }

    public boolean precedesById(Student otherStudent) {
        if (numID < otherStudent.numID)
            return true;
        else
            return false;
    }

    public String toString() {
        String out = name + ", student number " + numID;
        if (classList.size() == 0) {
            out += ", is not enrolled in any classes.\n";
        } else if (classList.size() < 3) {
            out += ", is taking:";
            for (Course course : classList) {
                out += "\n" + course;
            }
            out += "\nand they are not a full-time student.\n";}
        else {
            out += ", is taking:";
            for (Course course : classList) {
                out += "\n" + course;
            }
            out += "\nand they are a full-time student.\n";
        }
        return out;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student otherStudent = (Student) obj;
            return name.equals(otherStudent.name) &&
                    numID == otherStudent.numID;
        } else return false;
    }

}
