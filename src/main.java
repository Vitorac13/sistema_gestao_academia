import src.SistemaAcademia;


void main(){
    String input = "";
    SistemaAcademia a = new SistemaAcademia();
    
    IO.println("Bem vindo ao sistema de Academia\n\n");
    while(input != ""){
        IO.println("Digite o numero da opção desejada:\n1 - Cadastrar Aluno\n2 - Cadastrar Professor\n3 - Cadastrar Treino\n4 - Listar Alunos\n5 - Listar Professores\n6 - Listar Treinos\n7 - Sair");
        input = String.valueOf(IO.readln());
        switch(input){
            case "1":
                a.cadastrarAluno();
                break;
            case "2":
                a.cadastrarProfessor();
                break;
            case "3":
                a.cadastrarTreino();
                break;
            case "4":
                a.listarAlunos();
                break;
            case "5":
                a.listarProfessores();
                break;
            case "6":
                a.listarTreinos();
                break;
            case "7":
                input = "";
                break;
            default:
                IO.println("Opção inválida");
        }
    }
}