/**
 * balrog inheritance that connects tp creature
 * 
 * @author (Ben Adelson) 
 * @version (2019-11-08)
 */
public class Balrog extends Creature
{
    // instance variables - replace the example below with your own
    private static int MAX_STR = 100;
    private static int MIN_STR = 50;
    private static int MAX_HP = 200;
    private static int MIN_HP = 80;

    /**
     * Constructor for objects of class Human
     */
    public Balrog()
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
    
    /**
     * Method that creates the Balrog
     * @param hp are hitpoints for the Balrog between the range of 80-200
     * @param str is strength for the Balrog between the range of 50-100
     */
    public Balrog(int str, int hp){
        super(str,hp);
    }
    
    /**
     * Method calculates the damage the Lord of the End Times (or Balrog) creates
     * @param hp are hitpoints for the Balrog between the range of 80-200
     * @param str is strength for the Balrog between the range of 50-100
     */
    
    public int damage(){
        damageInflicted = super.damage();
        damageInflicted += super.damage();
        return damageInflicted;
    }

}