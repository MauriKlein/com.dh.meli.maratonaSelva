import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Criando alguns maratonistas
        Maratonista maratonista1 = new Maratonista("123456","Mauri", "Klein",40,"(55)9999999", "(55)99999999", "A+");
        Maratonista maratonista2 = new Maratonista("123457","Marlise", "Klein",47,"(55)9999999", "(55)99999999", "A+");
        Maratonista maratonista3 = new Maratonista("123458","Bruno", "Klein",14,"(55)9999999", "(55)99999999", "A+");
        Maratonista maratonista4 = new Maratonista("123459","Keila", "Klein",10,"(55)9999999", "(55)99999999", "A+");

        //Criando os 3 circuitos
        final Circuito pequenoCircuito = new Circuito(Categoria.PEQUENO, 2);
        final Circuito medioCircuito = new Circuito(Categoria.MEDIO, 5);
        final Circuito avancadoCircuito = new Circuito(Categoria.AVANCADO, 10);

        //Preenchendo Inscrições
        Inscricao inscricao1 = new Inscricao(maratonista1, Categoria.PEQUENO);
        Inscricao inscricao2 = new Inscricao(maratonista2, Categoria.PEQUENO);
        Inscricao inscricao3 = new Inscricao(maratonista3, Categoria.PEQUENO);
        Inscricao inscricao4 = new Inscricao(maratonista4, Categoria.PEQUENO);

        Inscricao inscricao5 = new Inscricao(maratonista1, Categoria.MEDIO);
        Inscricao inscricao6 = new Inscricao(maratonista2, Categoria.MEDIO);
        Inscricao inscricao7 = new Inscricao(maratonista3, Categoria.MEDIO);
        Inscricao inscricao8 = new Inscricao(maratonista4, Categoria.MEDIO);

        Inscricao inscricao9 = new Inscricao(maratonista1, Categoria.AVANCADO);
        Inscricao inscricao10 = new Inscricao(maratonista4, Categoria.AVANCADO);
        Inscricao inscricao11 = new Inscricao(maratonista2, Categoria.AVANCADO);


        //Adicionando maratonistas aos circuitos;
        pequenoCircuito.adicionarInscricao(inscricao1);
        pequenoCircuito.adicionarInscricao(inscricao2);
        pequenoCircuito.adicionarInscricao(inscricao3);
        pequenoCircuito.adicionarInscricao(inscricao4);

        System.out.println("*********************************");
        medioCircuito.adicionarInscricao(inscricao5);
        medioCircuito.adicionarInscricao(inscricao6);
        medioCircuito.adicionarInscricao(inscricao7);
        medioCircuito.adicionarInscricao(inscricao8);
        System.out.println("*********************************");

        avancadoCircuito.adicionarInscricao(inscricao9);
        avancadoCircuito.adicionarInscricao(inscricao10);
        avancadoCircuito.adicionarInscricao(inscricao11);

        System.out.println("*********************************");
        //Tentando adicionar um maratonista 2x na mesma circuito
        pequenoCircuito.adicionarInscricao(inscricao1);
        System.out.println(avancadoCircuito.toString());

        System.out.println("*********************************");
        //removendo um maratonista de um circuito
        avancadoCircuito.removerInscricao("Mauri");

        System.out.println("*********************************");

        //Exibindo as listas de inscritos por categoria
        System.out.println("***********Inscritos na Categoria PEQUENO**********************");
        System.out.println(pequenoCircuito.toString());

        System.out.println("***********Inscritos na Categoria MEDIO**********************");
        System.out.println(medioCircuito.toString());

        System.out.println("***********Inscritos na Categoria AVANCADO**********************");
        System.out.println(avancadoCircuito.toString());

        //Adicionando a lista de circuitos a Corrida na Selva
        ArrayList<Circuito> listaCircuitos = new ArrayList<>();
        listaCircuitos.add(pequenoCircuito);
        listaCircuitos.add(medioCircuito);
        listaCircuitos.add(avancadoCircuito);
        CorridaSelva meliw5 = new CorridaSelva(listaCircuitos);
        System.out.println(meliw5.toString());



    }
}
