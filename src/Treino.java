import Exercicio;

public class Treino {
    public String nome;
    public List<Exercicios> carga;

    public Treino(String nome, List<Exercicios> carga){
        setNome(nome);
        setCarga(carga);
    }

    public void setCarga(List<Exercicios> carga) {
        this.carga = carga;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}