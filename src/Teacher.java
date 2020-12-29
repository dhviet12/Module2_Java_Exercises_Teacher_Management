public class Teacher {
    private String name;
    private String birthday;
    private String hometown;
    private int fixSalary;
    private int bonusSalary;
    private int fineMoney;

    public Teacher(String name, String birthday, String hometown, int fixSalary, int bonusSalary, int fineMoney) {
        this.name = name;
        this.birthday = birthday;
        this.hometown = hometown;
        this.fixSalary = fixSalary;
        this.bonusSalary = bonusSalary;
        this.fineMoney = fineMoney;
    }

    public String getName() {
        return name;
    }

    public int getSalary(){
        return fixSalary+bonusSalary-fineMoney;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", hometown='" + hometown + '\'' +
                ", fixSalary=" + fixSalary +
                ", bonusSalary=" + bonusSalary +
                ", fineMoney=" + fineMoney +
                ", attainedSalary= " + this.getSalary() +
                '}' +"\n";
    }
}
