public class Treino {
    public String nome;
    public List<exercicios> carga;

    public Treino(String nome, List<exercicios> carga){
        setNome(nome);
        setCarga(carga);
    }

    public void setCarga(List<exercicios> carga) {
        this.carga = carga;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}