import java.util.ArrayList;

public class CorridaSelva {

    private ArrayList<Circuito> circuitos;
    private int totalInscritos;
    private Double valorTotalArrecadado;

    public CorridaSelva(ArrayList<Circuito> circuitos) {
        this.circuitos = circuitos;
        this.valorTotalArrecadado = calcularValorArrecadado();
        this.totalInscritos = calcularTotalInscritos();
    }

    private int calcularTotalInscritos() {
        int totalInscritos = 0;
        for(Circuito c: circuitos){
            totalInscritos+=c.getListaInscricoes().size();
        }
        return totalInscritos;
    }

    private Double calcularValorArrecadado(){
        Double valorTotal=0.0;
        for(Circuito c: circuitos){
            for (Inscricao i: c.getListaInscricoes()){
                valorTotal+=i.getValorInscricao();
            }
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "\n\nCorridaSelva {" +
                "totalInscritos=" + totalInscritos +
                ", valorTotalArrecadado=" + valorTotalArrecadado +
                '}';
    }
}
