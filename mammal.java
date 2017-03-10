public class mammal extends Animal
{
    private int length;
    
    /**
     * creates a mammal with default hair length
     */
    public mammal()
    {
        super("mammal");
        length = 1;        
    }
    
    /**
     * creates a mammal with the specified hair length
     */
    public mammal(int hair_length)
    {
        super("mammal");
        length = hair_length;
    }
    
    /**
     * returns the mammal's hair length
     */
    public int getLength()
    {
        return length;
    }
    
    /**
     * returns how the mammal moves
     */
    public String move()
    {
       return "walk"; 
    }
    
    
    /**
     * returns a string representation of the mammal
     */
    public String toString()
    {
        return super.toString() +
        "\nI have hair " + getLength() + " cm long!";       
    }
}