public abstract class Reptile extends Animal
{
    private int numberOfLegs;
    
    /**
     * Creates a reptile with no legs
     */
    public Reptile()
    {
        //call the default constructor of Animal
        //happens automatically
        //super();
        
        //has to be called first
        super("reptile");
        //type = "reptile"; //private data will cause error
        numberOfLegs = 0;      
        
    }
   
    
    /**
     * Creates a reptile with the given number of legs
     */
    public Reptile(int numberLegs)
    {
        super("reptile");
        numberOfLegs = numberLegs;        
    }
    
    /**
     * Returns this Reptile's number of Legs
     */
    public int getLegs()
    {
        return numberOfLegs;        
    }
    
    /**
     * returns how this reptile moves
     */
    public String move()
    {
        return "crawl";
    }
    
    /**
     * Returns a string representation of reptile
     */
    public String toString()
    {
        return super.toString() +
        "\nI have " + getLegs() + " number of Legs";
    }
}