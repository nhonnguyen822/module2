package ss8.service;

import ss8.entity.Motor;
import java.util.List;

public interface IMotorSevice {
    List<Motor> findAll();

    void add(Motor motor);
}
