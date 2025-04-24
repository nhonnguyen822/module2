package ss8.repository;

import ss8.entity.Motor;
import java.util.List;

public interface IMotorRepository {

    List<Motor> finalAll();

    void add(Motor motor);
    void delete(Motor motor);


}
