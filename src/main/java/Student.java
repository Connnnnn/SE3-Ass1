import java.util.ArrayList;
import java.util.Date;

public class Student {

    private String Name;
    private int Age;
    private String DOB;
    private String ID;
    private String username;
    private ArrayList<Course> courses;
    private ArrayList<Modules> modules;

    public Student(String name, int age, String DOB, String ID, ArrayList<Course> courses, ArrayList<Modules> modules) {

        Name = name;
        Age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.courses = courses;
        this.modules = modules;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsername(String name, int Age) {
        String username = name.toLowerCase() + Age;
        username = username.replaceAll("\\s+","");
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Modules> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Modules> modules) {
        this.modules = modules;
    }
}
