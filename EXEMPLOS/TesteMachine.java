
public class TesteMachine {
    public static void main(String[] args){
        TicketMachine t1 = new TicketMachine(5);
        System.out.println(t1.getPrice());
        t1.insertMoney(15);
        System.out.println(t1.getBalance());
        t1.printTicket();
        t1.printTotal();
    }
}
