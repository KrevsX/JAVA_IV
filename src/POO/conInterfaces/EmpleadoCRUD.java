package POO.conInterfaces;

import POO.sinInterfaces.Empleado;

import java.util.List;

/**
 *
 * @author POO
 *
 * se declaran todos los metodos, no se implementaran
 *
 * actua como ujn contrato dice lo que hay que hacer pero no lo hace
 */
public interface EmpleadoCRUD {

    void save(Empleado empleado);
    List<Empleado> findAll();

    void delete (Empleado empleado);
}
