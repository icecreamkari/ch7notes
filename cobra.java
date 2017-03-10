public class cobra extends snake
{
    private String color;
    
    /**
     * creates a cobra with a default color of yellow
     */
    public cobra()
    {
        super(10);
        color = "yellow";      
    }
    
    /**
     * creates a cobra with the given color
     */
    public cobra(String scale_color)
    {
        super(10);
        color = scale_color;
    }
    
    /**
     * Returns this cobra's color
     */
    public String getColor()
    {
        return color;        
    }
    
    /**
     * returns a string representation of the cobra
     */
    public String toString()
    {
        return super.toString() + 
        "\nI am " + getColor();
    }
}