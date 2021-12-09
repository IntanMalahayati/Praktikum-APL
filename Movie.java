public class Movie extends IronManDecor
{
    /**
     * Constructor for objects of class Movie
     */
    public Movie(IronMan ironMan) {
        //method super untuk object dari class IronMan
        super(ironMan); 
    }

    public String decorate() {
        //this untuk object dari class Movie
        return super.decorate() + this.decorateWithMovie();
    }

    public String decorateWithMovie() {
        return "Iron-Man The Movie"; 
    }
}
