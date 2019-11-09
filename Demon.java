/**
 * human inheritance that connects tp creature
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
     * Constructor for objects of class Human
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
     * Method that creates the Elf
     * @param hp are hitpoints for the demon between the range of 6-14
     * @param str is strength for the demon between the range of 5-20
     */
    public Demon(int str, int hp){
        super(str,hp);
    }
    
    public int MagicalDamage(){
        int magicPercent;
        magicPercent = random.nextInt(5)+1; //5% chance
        damageInflicted = super.damage();
        if(magicPercent == 2){
            damageInflicted = str + 50;
            System.out.println("For Chaos!");
        }
        return damageInflicted;
    }

}