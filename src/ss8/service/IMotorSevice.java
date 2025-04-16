package ss8.service;

import ss8.entity.Motor;
import java.util.ArrayList;

public interface IMotorSevice {
    ArrayList<Motor>findAll();

    void add(Motor motor);
    void display(ArrayList<Motor> motors);
}
