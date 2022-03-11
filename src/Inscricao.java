public class Inscricao {
    private Maratonista maratonista;
    private Categoria categoria;
    private Double valorInscricao;

    public Inscricao(Maratonista maratonista, Categoria categoria) {
        this.maratonista = maratonista;
        this.categoria = categoria;
        this.valorInscricao = calcularValor();
    }

    private Double calcularValor(){
        switch (this.categoria){
            case PEQUENO:
                if(maratonista.getIdade()<18){
                    return 1300.0;
                }else{
                    return 1500.0;
                }
            case MEDIO:
                if(maratonista.getIdade()<18){
                    return 2000.0;
                }else{
                    return 2300.0;
                }
            case AVANCADO:
                return 2800.0;

        }
        return null;
    }

    public Maratonista getMaratonista() {
        return maratonista;
    }

    public void setMaratonista(Maratonista maratonista) {
        this.maratonista = maratonista;
    }

    public Double getValorInscricao() {
        return valorInscricao;
    }

    public void setValorInscricao(Double valorInscricao) {
        this.valorInscricao = valorInscricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "\nInscricao{" +
                "maratonista=" + maratonista +
                ", categoria=" + categoria +
                ", valorInscricao=" + valorInscricao +
                '}';
    }
}
