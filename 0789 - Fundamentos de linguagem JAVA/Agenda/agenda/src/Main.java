
/*

add contacto
editar contacto
remover contacto
listar

-- pesquisar <--- ?

 */

public class Main {
    public static void main(String[] args) {

        Agenda ag = new Agenda();
        System.out.println("App Demo Agenda");
        System.out.println("---------------------------");


        Contacto ct = new Contacto("Joao", 12345);
        Contacto ct2 = new Contacto("carlos", 981231213);

      //  System.out.println(ct.equals(ct2));
       // System.out.println(ct == ct2);
        ag.addContacto(ct);
        ag.addContacto(ct2);
        ag.addContacto("Rita", 192121232);

        ag.listarContactos();

        System.out.println("-----------");
        ag.delContacto(ct);

        ag.listarContactos();


        System.out.println("---------------singleton------------");




        Agenda.myAgenda.addContacto(ct);
        Agenda.myAgenda.addContacto(ct2);
        Agenda.myAgenda.addContacto("Rita", 192121232);

        Agenda.myAgenda.listarContactos();

        System.out.println("-----------");
        Agenda.myAgenda.delContacto(ct);

        Agenda.myAgenda.listarContactos();

        System.out.println("-----------");
        Agenda.myAgenda.delContacto(55);

        Agenda.myAgenda.listarContactos();

        Agenda.myAgenda.editarContacto(0, "Novo Nome Cool");

        Agenda.myAgenda.listarContactos();
    }

}