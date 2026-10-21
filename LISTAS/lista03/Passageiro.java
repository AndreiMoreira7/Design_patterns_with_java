package lista03;
import java.util.Date;
import java.util.Scanner;

class Passageiro{
    Scanner sc = new Scanner(System.in);

    protected String nome, documento, email, numTelefone;
    protected Date dataNasc;

    public void getNome(){
        System.out.println("Nome: " + nome);
    }

    public void setNome(){
        System.out.println("Digite o nome do passageiro: ");
        this.nome = sc.nextLine();
    }

    public void setDocumento(){
        System.out.println("Digite o documento do passageiro: ");
        this.documento = sc.nextLine();
    }

     public void getDocumento(){
        System.out.println("Documento: " + documento);
    }

    public void setEmail(){
        while(true){
            System.out.println("Digite o email do passageiro: ");
            this.email = sc.nextLine();
            if(email.endsWith("@gmail.com") == true || email.endsWith("@hotmail.com") == true || email.endsWith("@yahoo.com") == true) break;
            else System.out.println("Formato de Email inválido!");
        } 
    }

     public void getEmail(){
        System.out.println("Email: " + email);
    }

    public void setTelefone(){
        System.out.println("Digite o telefone do passageiro: ");
        this.numTelefone = sc.nextLine();
    }

     public void getTelefone(){
        System.out.println("Telefone: " + numTelefone);
    }

    public void setDataNasc(){
        System.out.println("Digite a data de nascimento do passageiro: ");
        this.dataNasc = ;
    }

     public void getDataNasc(Date dataNasc){
        System.out.println("Data de Nascimento: " + dataNasc);
    }

    public void getTodosDados(Date dataNasc, String numTelefone, String email, String nome, String documento){
        System.out.println("Data de Nascimento: " + dataNasc + "\n" + "Nome: " + nome + "\n" + "Documento: " + documento + "\n" + "Email: " + email + "\n" + "Telefone: " + numTelefone);
    }
}


