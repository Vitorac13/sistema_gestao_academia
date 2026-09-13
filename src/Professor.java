public class Professor {

    public int id;
    public String nome;
    private String cpf;

    public Professor(int id, String nome, String cpf){
        setId(id);
        setNome(nome);
        setcpf(cpf);
    };

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}