// class yang mengimplementasikan interface IronMan
public class Category implements IronMan
{
    /**
     * override method from interface IronMan
     */
    @Override
    public String decorate()
    {
        return "Iron-Man, ";
    }
}
