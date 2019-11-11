/**
 * balrog inheritance that connects to creature
 * 
 * @author (Ben Adelson) 
 * @version (2019-11-08)
 */
public class CyberDemon extends Creature
{
    // instance variables - replace the example below with your own
    private static int MAX_STR = 40;
    private static int MIN_STR = 20;
    private static int MAX_HP = 100;
    private static int MIN_HP = 25;

    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
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
     * Method that creates the CyberDemon
     * @param hp are hitpoints for the CyberDemon between the range of 25-100
     * @param str is strength for the CyberDemon between the range of 20-40
     */
    public CyberDemon(int str, int hp){
        super(str,hp);
    }
    
    /**
     * Method calculates the damage the CyberDemon creates
     * @param hp are hitpoints for the CyberDemon between the range of 25-100
     * @param str is strength for the CyberDemon between the range of 20-40
     */
    
    public int damage(){
        damageInflicted = super.damage();
        return damageInflicted;
    }

}
