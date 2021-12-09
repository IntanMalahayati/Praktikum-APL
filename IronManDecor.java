// abstract class untuk implementasi dari interface IronMan
public abstract class IronManDecor implements IronMan
{
    private IronMan ironMan;

    /**
     * Constructor for objects of abstract class IronManDecor
     *
     * @param  ironMan object ironMan untuk didekorasi
     */
    public IronManDecor(IronMan ironMan)
    {
        // put your code here
        this.ironMan = ironMan;
    }

    
    /**
     * override method untuk decorate object ironMan
     */
    @Override //overide method decorate
    public String decorate() {
        return ironMan.decorate();
    }
}
