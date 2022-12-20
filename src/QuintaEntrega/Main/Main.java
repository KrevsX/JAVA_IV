package QuintaEntrega.Main;

import QuintaEntrega.Interface.CocheCRUD;
import QuintaEntrega.Interface.CocheCRUDImpl;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}
