public class animalsClient
{
    /**
     * Instantiates an animal and reptile object and prints information about them
     */
    
    public static void main(String[] args)
    {
        //Animal bob = new Animal("Mammal");
        //System.out.println(bob );
        
        
        //Reptile sue = new Reptile();
        //inherited both from Animal
        //System.out.println(sue.getType() );
        //System.out.println( sue ); 

        snake Brian = new snake(10);
        System.out.println(Brian.getType());
        System.out.println(Brian.getLegs());
        System.out.println(Brian);
        
        //snake can't be a reptile, reptile can be a snake
        //be-a relationship
        Reptile jill = new snake();
        Animal bob2 = new snake(); //is a snake object -- animal is polymorphic
        
        cobra rob = new cobra("green");
        System.out.println(rob);
        
        mammal joe = new mammal(2);
        System.out.println(joe);
    }   
}