package frompythontojava.onlineshop.part2;

public class Order implements Orderable{

    private int id;
    private String status = "NEW";

    private static Integer nextID = 100;

    public Order(){
        this.id = getNextID();
    }

    public String getStatus(){
        return this.status;
    }

    public boolean checkout(){
        return this.status.equals("NEW");
    }

    public boolean pay(){
        return this.status.equals("CHECKED");
    }

    public Integer getNextID() {
        Integer id = nextID;
        nextID++;
        return id;
    }

    public String toString(){
        return String.format("Order number: %s status is - %s", this.id, this.status);
    }

}