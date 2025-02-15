package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;
/**
 * Parameterize this service and add its implementation in a separate class.
 */

public interface MachineService<T extends Machine> {

    List<T> getAll(Class<? extends Machine> type);

    /**
     * Fill the machines list with passed value
     * Replace the Object with parametrized value.
     * This method should be able to work well with any type of machine passed as 'value'
     *
     * @param machines - list of machines to be filled with value
     * @param value    - any object of machine sub class
     */
    void fill(List<? super Machine> machines, T value);

    /**
     * Call the method doWork() from each machine.
     * This method should be able to accept a list of bulldozers as well as list of trucks.
     *
     * @param machines - the list of machines
     */
    void startWorking(List<? extends Machine> machines);
}
