public class snake extends Reptile
{
    private int length;
    
    /**
     * creates a length with default length of 10
     */
    public snake()
    {
        super(0);
        length = 5;
    }
    
    /**
     * creates a snake with the given length
     */
    public snake(int length_of_snake)
    {
        super(0);
        length = length_of_snake;         
    }
    
    /**
     * Return's this snake's length
     */
    public int getLength()
    {
        return length;
    }
    
    
    /**
     * returns how this reptile moves
     */
    public String move()
    {
        return "slither";
    }
    
    /**
     * returns a string represntation of the snake
     */
    public String toString()
    {
        return super.toString() + 
        "\nI am " + getLength() + " inches long";
    }
}