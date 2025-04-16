package ss8.repository;

import ss8.entity.Motor;
import java.util.ArrayList;

public interface IMotorRepository {
    ArrayList<Motor> finalAll();

    void add(Motor motor);
    void delete(Motor motor);

}
