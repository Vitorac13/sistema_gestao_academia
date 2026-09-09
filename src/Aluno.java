public class Aluno{
    private String nome;
    private String cpf;
    private ficha ficha;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFicha(ficha ficha) {
        this.ficha = ficha;
    }

    public String getNome() {
        return nome;
    }
    
    public ficha getFicha() {
        return ficha;
    }
}

class ficha{
    private int id;
    private String cpf_professor;
    private List<Treino> carga;
}