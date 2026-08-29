package lista02;

class Aluno{
    String nome;
    String RG;
    String DataNascimento;
    Turma turma;

    Aluno(String nome, String RG, String DataNascimento, Turma turma){
            this.nome = nome;
            this.RG = RG;
            this.DataNascimento = DataNascimento;
            this.turma = turma;
    }
}

class Funcionario{
    String nome;
    double salario;

    Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
}

class TestaFuncionario{
    public static void main(String[] args){
        Funcionario func1 = new Funcionario("funcionario 1", 10000);
        System.out.println("nome = " + func1.nome + " | salário = " + func1.salario);
    }
}

class Turma{
    String periodo;
    int serie;
    String sigla;
    String tipoEnsino;

    Turma(String periodo, int serie, String sigla, String tipoEnsino){
        this.periodo = periodo;
        this.serie = serie;
        this.sigla = sigla;
        this.tipoEnsino = tipoEnsino;
    }
}

class TestaTurma{
    public static void main(String[] args){
        Turma t1 = new Turma("noturno", 5, "A", "Superior");
        Turma t2 = new Turma("noturno", 4, "A", "Superior");

        System.out.println("Turma 1 - periodo = " + t1.periodo + ", série = " + t1.serie + t1.sigla + ", Ensino = " + t1.tipoEnsino);
        System.out.println("Turma 1 - periodo = " + t2.periodo + ", série = " + t2.serie + t2.sigla + ", Ensino = " + t2.tipoEnsino);
    }
}

class TestaAlunoTurma{
    public static void main(String[] args){
        Turma t3 = new Turma("noturno", 4, "A", "Superior");
        Aluno aluno1 = new Aluno("ALBERT EINSTEIN", "101-010-10-10", "10/10/1903", t3);

        System.out.println("Dados Aluno = " + aluno1.nome + " | " + aluno1.RG + " | " + aluno1.DataNascimento);
        System.out.println("Dados turma do aluno = " + aluno1.turma.periodo + " | " + aluno1.turma.serie + aluno1.turma.sigla + " | Ensino  " + aluno1.turma.tipoEnsino);
    }
}

