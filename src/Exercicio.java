public class Exercicio {
    private string nome;
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

    public void setSeries(int series) {
        this.series = series;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }
    public void setNome(string nome) {
        this.nome = nome;
    }
    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    /*public List getExercicio(){
        if(!maquina == null){
            return {nome, series, repeticoes};
        }
        return {nome, series, repeticoes, maquina};
    }*/
}