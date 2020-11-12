//import com.sun.xml.internal.bind.v2.model.core.ID;
//import sun.security.pkcs11.Secmod;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Modules> modules = new ArrayList<Modules>();

    @org.junit.jupiter.api.Test
    void getName() {
    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void getDOB() {
    }

    @org.junit.jupiter.api.Test
    void getID() {
        Student student = new Student("Conor", 21, "1998-12-08", "1738", courses, modules);

        //assertEquals();
    }

    @org.junit.jupiter.api.Test
    void getUsername() {
    }

    @org.junit.jupiter.api.Test
    void getCourses() {
    }

    @org.junit.jupiter.api.Test
    void getModules() {
    }
}