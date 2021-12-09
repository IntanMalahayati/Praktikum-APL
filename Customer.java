// implementation class of interface Observer
public class Customer implements Observer
{
    private String cust;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String cust)
    {
        // initialise customer from Customer
        this.cust = cust;
    }

    /**
     * override method update from Observer
     *
     * @param  s notification dari class Main
     */
    @Override
    public void update(String s)
    {
        IronMan category = new Comic(new Movie(new Category())); //implements decorator pattern
        System.out.println("Notification for " +this.cust+ ": a new edition of " + category.decorate() + s); //this.pembeli berlaku untuk pembeli dan type.decorate berlaku untuk memanggil method decorate pada class type
    }
}
