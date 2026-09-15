public class example05{
    public static void main(String[] args){
        int codigoStatus = 404;

        System.out.println("Código: " + codigoStatus);
       if(codigoStatus >= 100 && codigoStatus <= 199){
            System.out.println("Informativo");
       }
       else if(codigoStatus >= 200 && codigoStatus <= 299){
            System.out.println("Sucesso");
       }
       else if(codigoStatus >= 300 && codigoStatus <= 399){
            System.out.println("Redirecionamento");
       }
        else if(codigoStatus >= 400 && codigoStatus <= 499){
            System.out.println("Redirecionamento");
       }
        else if(codigoStatus >= 500 && codigoStatus <= 599){
            System.out.println("Redirecionamento");
       }
       else{
        System.out.println("Código inválido");
       }
    }
}