package POO.sinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        EmpleadoCRUDV1 empleadoCRUDV1 = new EmpleadoCRUDV1();
//
//        Empleado juanito = new Empleado("Juan", 27, 1500, true);
//        Empleado Kevs = new Empleado("Kevin", 27, 1500, true);
//        Empleado Mcintyre = new Empleado("Orem", 27, 1500, true);
//
//        System.out.println(juanito);
//
//
//        // guardar empleados
//        empleadoCRUDV1.save(juanito);
//        empleadoCRUDV1.save(Kevs);
//        empleadoCRUDV1.save(Mcintyre);
//
//        List<Empleado> empleados = empleadoCRUDV1.findAll();
//        System.out.println(empleados);

        // USAR V2

        EmpleadoCRUDV2 empleadoCRUDV2 = new EmpleadoCRUDV2();

        Empleado juanito = new Empleado("Juan", 27, 1500, true);
        Empleado Kevs = new Empleado("Kevin", 27, 1500, true);
        Empleado Mcintyre = new Empleado("Orem", 27, 1500, true);

        System.out.println(juanito);

        // consultar empleados

        List<Empleado> empleados = empleadoCRUDV2.recuperarEmpleado();
        System.out.println(empleados);



    }
}
