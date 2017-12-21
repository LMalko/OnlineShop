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
        System.out.println(item.toString());

    }
    protected abstract void action(Orderable item);

    public void stepAfter(){
        System.out.println(item.toString());
    }

}