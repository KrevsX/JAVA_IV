package QuintaEntrega.Main;

import QuintaEntrega.Interface.CocheCRUD;
import QuintaEntrega.Interface.CocheCRUDImpl;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        // Version 1
        System.out.println("        // Version 1\n");
        System.out.println("-----------------------");
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();

        // Version 2
        System.out.println("        // Version 2\n");
        System.out.println("-----------------------");
        System.out.println(cocheCRUD);
    }
}
