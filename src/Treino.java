import src.Exercicio;

public class Treino {

    public String nome;
    public List<Exercicio> carga;

    public Treino(String nome, List<Exercicio> carga){
        setNome(nome);
        setCarga(carga);
    }

    public void setCarga(List<Exercicio> carga) {
        this.carga = carga;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
}