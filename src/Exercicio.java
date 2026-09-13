public class Exercicio {
    
    private String nome;
    private String maquina;
    private int series;
    private int repeticoes;

    public Exercicio(String nome, String maquina, int series, int repeticoes){
        setNome(nome);
        setMaquina(maquina);
        setSeries(series);
        setRepeticoes(repeticoes);
    }

    public Exercicio(String nome, int series, int repeticoes){
        setNome(nome);
        setSeries(series);
        setRepeticoes(repeticoes);
    }

    private void setSeries(int series) {
        this.series = series;
    }

    private void setMaquina(String maquina) {
        this.maquina = maquina;
    }
    private void setNome(string nome) {
        this.nome = nome;
    }
    private void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public String getMaquina() {
        return maquina;
    }

    public String getNome() {
        return nome;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public int getSeries() {
        return series;
    }

    public Exercicio getExercicio(){
        return this;
    }
}