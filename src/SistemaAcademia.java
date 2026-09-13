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


}