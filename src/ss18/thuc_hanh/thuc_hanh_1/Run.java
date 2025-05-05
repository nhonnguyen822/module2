package ss18.thuc_hanh.thuc_hanh_1;

public class Run {
    public static void main(String[] args) {
        RunnableDemo runnableDemo=new RunnableDemo("HR-Database");
        RunnableDemo runnableDemo1=new RunnableDemo("Send-Email");
        runnableDemo.star();
        runnableDemo1.star();
    }
}
