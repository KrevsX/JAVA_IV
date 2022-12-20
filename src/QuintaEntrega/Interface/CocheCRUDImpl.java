package QuintaEntrega.Interface;

public class CocheCRUDImpl implements CocheCRUD{

    String save = "Guardar...........";
    String findAll = "Guardar...........";
    String delete = "Guardar...........";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }

    @Override
    public void save() {

        System.out.println("SAVE");
    }

    @Override
    public void findAll() {

        System.out.println("FIND ALL");
    }

    @Override
    public void delete() {

        System.out.println("DELETE");
    }
}
