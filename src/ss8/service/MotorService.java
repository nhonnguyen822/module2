package ss8.service;

import ss8.entity.Motor;
import ss8.repository.IMotorRepository;
import ss8.repository.MotorRepository;

import java.util.ArrayList;

public class MotorService implements IMotorSevice {
    private IMotorRepository motorRepository = new MotorRepository();

    @Override
    public ArrayList<Motor> findAll() {
        return motorRepository.finalAll();
    }

    @Override
    public void add(Motor motor) {
        motorRepository.add(motor);
    }
}
