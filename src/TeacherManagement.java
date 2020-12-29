import java.util.ArrayList;

public class TeacherManagement {
    private ArrayList<Teacher> teachersManagement = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        teachersManagement.add(teacher);
    }

    public void displayByName(String name) {
        boolean notFound = true;
        for (Teacher teacher : teachersManagement) {
            boolean hasName = teacher.getName().equalsIgnoreCase(name);
            if (hasName) {
                notFound = false;
                System.out.println(teacher);
            }
        }
        if (notFound) {
            System.out.println("Not found in list");
        }
    }
    public void displayBySalary(){
        for (Teacher teacher : teachersManagement) {
            if (teacher.getSalary() >= 8000000) {
                System.out.println(teacher);
            }
        }
    }
    public void displayAll(){
        System.out.println(teachersManagement.toString());
    }

    @Override
    public String toString() {
        return "TeacherManagement{}";
    }
}
