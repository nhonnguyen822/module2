package ss8.repository;


import ss8.entity.Motor;

import java.util.ArrayList;

public class MotorRepository implements IMotorRepository {
    private static ArrayList<Motor> motors = new ArrayList<>();

    static {
        motors.add(new Motor("43-K1-678.56", "Yamaha", 2019, "Nguyễn Văn A", 100));
        motors.add(new Motor("43-H1-345.89", "Honda", 2019, "Nguyễn Văn B", 150));
        motors.add(new Motor("43-AK-765.23", "Yamaha", 2019, "Nguyễn Văn c", 50));
    }

    @Override
    public ArrayList<Motor> finalAll() {
        return motors;
    }

    @Override
    public void add(Motor motor) {
        motors.add(motor);

    }

    @Override
    public void delete(Motor motor) {
        motors.remove(motor);
    }

    @Override
    public void display(ArrayList<Motor> motors) {
        for (int i = 0; i < motors.size(); i++) {
            System.out.println(motors.get(i));
        }
    }
}
