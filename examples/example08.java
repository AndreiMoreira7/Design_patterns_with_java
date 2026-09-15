import java.util.Scanner;

class Aluno{
    public String nome, matricula;
}

class Disciplina{
    public String nome, codigo;
}

class associarAlunoDisciplina{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         Aluno aluno1 = new Aluno();

        System.out.print("Digite o nome do aluno1: ");
        aluno1.nome = sc.nextLine();
        System.out.print("Digite a matricula do aluno1: ");
        aluno1.matricula = sc.nextLine();
        System.out.print("Digite o numero de disciplinas que esse aluno vai estar matriculado: ");
        int numDisciplinas = sc.nextInt();

        sc.nextLine();

        Disciplina[] disciplinas = new Disciplina[numDisciplinas];

        for(int i = 0; i < numDisciplinas; i++){
            disciplinas[i] = new Disciplina();

            System.out.println("Digite o nome da materia " + (i + 1) + ": ");
            disciplinas[i].nome = sc.nextLine();
            System.out.println("Digite o codigo da materia " + (i + 1) + ": ");
            disciplinas[i].codigo = sc.nextLine();
        }
        System.out.println("====== AS MATÉRIAS ASSOCIADAS AO ALUNO " + aluno1.nome + " | " + aluno1.matricula + "SÃO ===============");
        for(int i = 0; i < numDisciplinas; i++){
            System.out.println("Matéria " + (i+1) + ": " + disciplinas[i].nome + " | código: " + disciplinas[i].codigo);
        }
    }
}