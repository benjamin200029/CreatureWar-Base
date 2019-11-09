/**
 * elf inheritance that connects to creature
 * 
 * @author (Ben Adelson) 
 * @version (2019-11-08)
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static int MAX_STR = 18;
    private static int MIN_STR = 5;
    private static int MAX_HP = 25;
    private static int MIN_HP = 8;

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
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
     * Method that creates the Elf
     * @param hp are hitpoints for the elf between the range of 8-25
     * @param str is strength for the elf between the range of 8-25
     */
    public Elf(int str, int hp){
        super(str,hp);
    }
    
    public int MagicalDamage(){
        int magicPercent;
        magicPercent = random.nextInt(10)+1; //10% chance
        damageInflicted = super.damage();
        if(magicPercent == 5){
            damageInflicted = 2 * str;
            System.out.println("The light blesses those who serve!");
        }
        return damageInflicted;
    }

}
