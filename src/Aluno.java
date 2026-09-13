import src.Treino;

public class Aluno{
    private String nome;
    private String cpf;
    private ficha ficha;

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setFicha(ficha ficha) {
        this.ficha = ficha;
    }

    public String getNome() {
        return nome;
    }
    
    public ficha getFicha() {
        return ficha;
    }

    public Aluno(String nome, String CPF){
        setNome(nome);
        setCpf(CPF);
    }

    public void inicializarFicha(String cpf_professor,List<Treino> treinos){
        ficha a = new ficha(cpf_professor,treinos);
        setFicha(a);
    }

    public void fecharFicha(){
        setFicha(null);
    }
}

class ficha{
    private int id;
    private String cpf_professor;
    private List<Treino> carga;

    public ficha(String cpf_professor,List<Treino> treinos){
        setCarga(treinos);
        setCpf_professor(cpf_professor);
    }

    private void setCarga(List<Treino> carga) {
        this.carga = carga;
    }

    private void setCpf_professor(String cpf_professor) {
        this.cpf_professor = cpf_professor;
    }
}