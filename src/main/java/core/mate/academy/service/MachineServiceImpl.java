package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> buldozersList = new ArrayList<>(new BulldozerProducer().get());
        List<Machine> excavatorsList = new ArrayList<>(new ExcavatorProducer().get());
        List<Machine> trucksList = new ArrayList<>(new TruckProducer().get());
        if (type == Bulldozer.class) {
            return buldozersList;
        } else if (type == Excavator.class) {
            return excavatorsList;
        } else if (type == Truck.class) {
            return trucksList;
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
