

/**
 * Write a description of class Human here.
 * 
 * @author (Ben Adelson) 
 * @version (2019-11-08)
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    private static int MAX_STR = 18;
    private static int MIN_STR = 8;
    private static int MAX_HP = 25;
    private static int MIN_HP = 10;
    
    
    //private static final int MAX_HUMAN_HP = 25;
    //private static final int MIN_HUMAN_HP = 5;
    //private static final int MAX_HUMAN_STR = 20;
    //private static final int MIN_HUMAN_STR = 5;

    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_HP-MIN_HP)+MIN_HP,    
            Randomizer.nextInt(MAX_STR-MIN_STR)+MIN_STR
        );
          
    }
    
    public Human(int str, int hp){
        
    }

}
