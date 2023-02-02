package Week4.School;

public class Student {
    private String name;
    private int numID;
    private static int nextID = 1;

    public Student(String name, int numID) {
        this.name = name;
        this.numID = numID;
    }

    public Student(String name) {
        this.name = name;
        numID = nextID;
        nextID++;
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

        return name + " is student number " + numID;
    }
}
