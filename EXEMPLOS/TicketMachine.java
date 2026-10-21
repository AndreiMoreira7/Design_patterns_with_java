public class TicketMachine{
    private int price, balance, total;

    public TicketMachine(int ticketCost){
        price = ticketCost;
        balance = 0;
        total = 0;
    }

    public int getPrice(){
        return price;
    }

    public int getBalance(){
        return balance;
    }

    public void insertMoney(int money){
        balance += money;
    }

    public void printTicket(){
        System.out.println("======== Ticket =======");
        System.out.println(price + " cents");

        total += balance;
        balance = 0;
    }

    public void printTotal(){
        System.out.println("Total: " + total);
    }
    
}