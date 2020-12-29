import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static TeacherManagement listTeacherManagement = new TeacherManagement();
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("1.Add new teacher");
            System.out.println("2.Show list teacher has salary more than 8 millions");
            System.out.println("3.Show all list teacher");
            System.out.println("4.Find teacher by name");
            System.out.println("0.Exit");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Enter number of teacher you want to add");
                    int number = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < number; i++) {
                        addTeacher();
                    }
                    break;
                case 2:
                    listTeacherManagement.displayBySalary();
                    break;
                case 3:
                    listTeacherManagement.displayAll();
                    break;
                case 4:
                    findByName();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (true);
    }
    public static void addTeacher(){
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter birthday day/month/year");
        String birthday = scanner.nextLine();
        System.out.println("Enter hometown");
        String hometown = scanner.nextLine();
        System.out.println("Enter fix salary");
        int fixSalary = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter bonus salary");
        int bonusSalary = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter fine money");
        int fineMoney = Integer.parseInt(scanner.nextLine());
        Teacher teacher = new Teacher(name,birthday,hometown,fixSalary,bonusSalary,fineMoney);
        listTeacherManagement.addTeacher(teacher);
        System.err.println("Successfully added");
    }
    public static void findByName(){
        System.out.println("Enter name of teacher you want to find");
        String name = scanner.nextLine();
        listTeacherManagement.displayByName(name);
    }
}
