import java.util.List;
import java.util.ArrayList;
import src.IO;
import src.Aluno;
import src.Professor;
import src.Treino;
import src.Exercicio;

public class SistemaAcademia{
    private List<Treino> treino;
    private List<Exercicio> exercicio;
    private List<Professor> professor;
    private List<Aluno> aluno;

    public SistemaAcademia(){
        IO.println("inicializando Sistema de Academia");
    }

    private List<Aluno> getAluno() {
        return aluno;
    }

    private List<Exercicio> getExercicio() {
        return exercicio;
    }

    private List<Professor> getProfessor() {
        return professor;
    }

    private List<Treino> getTreino() {
        return treino;
    }

    private void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }

    private void setExercicio(List<Exercicio> exercicio) {
        this.exercicio = exercicio;
    }

    private void setProfessor(List<Professor> professor) {
        this.professor = professor;
    }

    private void setTreino(List<Treino> treino) {
        this.treino = treino;
    }

    public void cadastrarAluno(){
        String nome = IO.readln("Digite o nome do aluno: ");
        String cpf = IO.readln("Digite o CPF do aluno: ");
        Aluno a = new Aluno(nome,cpf);
        this.aluno.add(a);

        String input = IO.readln("Deseja inicializar a ficha do aluno? (s/n): ");
        if(input.equals("s")){
            List<professor> p = this.getProfessor();
            IO.println("Selecione o professor responsável pelo treino do aluno:");
            for(int i = 0; i < p.size(); i++){
                IO.println((i+1) + " - " + p.get(i).getNome() + " - " + p.get(i).getCpf());
            }
            int index =  Integer.parseInt(IO.readln("Digite o número do professor: ")) - 1;
            String cpf_professor = p.get(index).getCpf();
            List<Treino> treinos = new ArrayList<Treino>();
            String input2 = "";
            while(input2 != "0"){
                input2 = IO.readln("Digite o nome do treino ou 0 para sair: ");
                if(input2 != "0"){
                    Treino t = new Treino(input2);
                    treinos.add(t);
                }
            }
            a.inicializarFicha(cpf_professor, treinos);
        }
    }

    public void cadastrarProfessor(){
        String nome = IO.readln("Digite o nome do professor: ");
        String cpf = IO.readln("Digite o CPF do professor: ");
        Professor p = new Professor(nome,cpf);
        this.professor.add(p);
    }

    public void cadastrarTreino(){
        String nome = IO.readln("Digite o nome do treino: ");
        String cpf_professor = IO.readln("Digite o CPF do professor: ");
        List<Exercicio> exercicios = new ArrayList<Exercicio>();
        String input = "";
        while(input != "0"){
            input = IO.readln("Digite o nome do exercício ou 0 para sair: ");
            if(input != "0"){
                Exercicio e = new Exercicio(input);
                exercicios.add(e);
            }
        }
        Treino t = new Treino(nome,cpf_professor,exercicios);
        this.treino.add(t);
    }

    public void listarAlunos(){
        List<Aluno> a = this.getAluno();
        for(Aluno aluno : a){
            IO.println("Nome: " + aluno.getNome() + " CPF: " + aluno.getCpf());
        }
    }

    public void listarProfessores(){
        List<Professor> p = this.getProfessor();
        for(Professor professor : p){
            IO.println("Nome: " + professor.getNome() + " CPF: " + professor.getCpf());
        }
    }

    public void listarTreinos(){
        List<Treino> t = this.getTreino();
        for(Treino treino : t){
            IO.println("Nome: " + treino.getNome() + " CPF do professor: " + treino.getCpf_professor());
            for(Exercicio exercicio : treino.getExercicios()){
                IO.println("Exercício: " + exercicio.getNome() + " Máquina: " + exercicio.getMaquina() + " Séries: " + exercicio.getSeries() + " Repetições: " + exercicio.getRepeticoes());
            }
        }
    }
}