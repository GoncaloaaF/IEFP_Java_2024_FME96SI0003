import java.util.ArrayList;

public class Agenda {

    public static Agenda myAgenda = new Agenda();

    private ArrayList<Contacto> listaContactos;


    public Agenda() {
        this.listaContactos = new ArrayList<>();
    }
/*

editar contacto
-- pesquisar por nome<--- ?

 */

    public Boolean addContacto(Contacto contacto) {
        return this.listaContactos.add(contacto);
    }

    public Boolean addContacto(String nome, int telefone) {
        Contacto contacto = new Contacto(nome, telefone);
        return this.listaContactos.add(contacto);
    }


    public Boolean delContacto(Contacto contacto) {
        return this.listaContactos.remove(contacto);
    }

    public Boolean delContacto(int indexContato) {

        // tem de ser validado se o indexContato existe
        if (this.listaContactos.size() <= indexContato) {
            System.out.println("o index não existe");
            return false;
        }

        this.listaContactos.remove(indexContato);
        return true;

    }

    public void listarContactos(){
        for (int i = 0; i < this.listaContactos.size(); i++) {
            System.out.println("------------Contacto:" + i + "-----------------");
            System.out.println(this.listaContactos.get(i).toString());
            System.out.println("-------------------------------");
        }
    }



    public void editarContacto(Contacto contacto, String novo_nome, int novo_telefone) {
        if (contacto.getNome() != null){
            contacto.setNome(novo_nome);
        }

        if (contacto.getTelefone() != -1){
            contacto.setTelefone(novo_telefone);
        }
    }

    public void editarContacto(int indexContato, String novo_nome, int novo_telefone) {
        Contacto contacto = this.listaContactos.get(indexContato);
        contacto.setNome(novo_nome);
        contacto.setTelefone(novo_telefone);
    }
cd 

    public void editarContacto(int indexContato, String novo_nome ) {
        Contacto contacto = this.listaContactos.get(indexContato);
        contacto.setNome(novo_nome);
    }


    public void editarContacto(int indexContato,  int novo_telefone ) {
        Contacto contacto = this.listaContactos.get(indexContato);
        contacto.setTelefone(novo_telefone);
    }



}
