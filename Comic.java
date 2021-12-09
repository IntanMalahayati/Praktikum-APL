//decorator class for class IronMaDecor
public class Comic extends IronManDecor
{
    /**
     * Constructor for objects of class Comic
     */
    public Comic(IronMan ironMan)
    {
        // object ironMan from class IronMan
        super(ironMan);
    }

    public String decorate() {
        return super.decorate() + this.decorateWithComic();
    }

    public String decorateWithComic() {
        return " and Iron-Man Comic Book"; 
    }
}
