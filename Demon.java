/**
 * demon inheritance that connects to creature
 * 
 * @author (Ben Adelson) 
 * @version (2019-11-08)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private static int MAX_STR = 14;
    private static int MIN_STR = 6;
    private static int MAX_HP = 20;
    private static int MIN_HP = 5;

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
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
     * Method that creates the Demon
     * @param hp are hitpoints for the demon between the range of 6-14
     * @param str is strength for the demon between the range of 5-20
     */
    public Demon(int str, int hp){
        super(str,hp);
    }
    
    /**
     * Method calculates the damage the Demon creates
     * @param hp are hitpoints for the Demon between the range of 80-200
     * @param str is strength for the Demon between the range of 50-100
     */
    
    public int damage(){
        int damagePercent;
        damagePercent = random.nextInt(5)+1; //5% chance
        damageInflicted = super.damage();
        if(damagePercent == 2){
            damageInflicted = str + 50;
            System.out.println("Demons screams: 'For Chaos!'");
        }
        return damageInflicted;
    }

}