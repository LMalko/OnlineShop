package frompythontojava.onlineshop.part2;

abstract class AbstractProcess {

    private Orderable item;

    public void process(Orderable item) {
        this.item = item;
        stepBefore();
        action(item);
        stepAfter();
    }
    public void stepBefore(){
        System.out.println(String.format("The status now is %s.The process will begin shortly."), this.item.status);

    }
    protected abstract void action(Orderable item);

    public void stepAfter(){

    }

}