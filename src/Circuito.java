import java.util.ArrayList;

public class Circuito {
    private Categoria categoria;
    private int distancia;
    private ArrayList<Inscricao> listaInscricoes;

    public Circuito(Categoria categoria, int distancia) {
        this.categoria = categoria;
        this.distancia = distancia;
        this.listaInscricoes = new ArrayList<>();
    }

    public void adicionarInscricao(Inscricao inscricao){
        if(inscricao.getCategoria().equals(this.categoria)) {
            if (!(inscricao.getMaratonista().getIdade() < 18 && inscricao.getCategoria().equals(Categoria.AVANCADO))) {
                if (!listaInscricoes.contains(inscricao)) {
                    inscricao.getMaratonista().setCodigo(listaInscricoes.size() + 1);
                    listaInscricoes.add(inscricao);
                    System.out.println(inscricao.getMaratonista().getNome() + " Inscrito na Circuito " + this.categoria + " Valor Inscrição: " + inscricao.getValorInscricao());
                } else {
                    System.out.println("ATENÇÃO: " + inscricao.getMaratonista().getNome() + " Já está inscrito na Circuito " + this.categoria);
                }
            } else {
                System.out.println("ATENÇÃO: " + inscricao.getMaratonista().getNome() + " não pode se inscrever em circuito " + this.categoria+ ". Menos de 18 anos.");
            }
        }
    }

    public void removerInscricao(String nome){
        if(listaInscricoes.removeIf(inscricao -> inscricao.getMaratonista().getNome().equals(nome))){
            System.out.println("Inscrição removida com sucesso!!!");
        }else{
            System.out.println("Maratonista não encontrado no circuito!!!");
        }
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public ArrayList<Inscricao> getListaInscricoes() {
        return listaInscricoes;
    }

    public void setListaInscricoes(ArrayList<Inscricao> listaInscricoes) {
        this.listaInscricoes = listaInscricoes;
    }

    @Override
    public String toString() {
        return "Circuito{" +
                "nome='" + categoria + '\'' +
                ", distancia=" + distancia +
                ", listaInscricoes=" + listaInscricoes +
                '}';
    }
}
