package ss5_accessmodifier_static.thuc_hanh.thuc_hanh_1;

public class Students {
    private int rollno;
    private String name;
    private static String college = "BB DIT";

    public Students() {
    }

    public Students(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    static void change() {
        college = "CODE GYM";
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void display() {
        System.out.println(this.rollno + " " + this.name + " " + college);
    }
}
