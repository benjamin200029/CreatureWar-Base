/**
 * Dwarf inheritance that connects to human
 * 
 * @author (Ben Adelson) 
 * @version (2019-11-10)
 */
public class Dwarf extends Human
{
    // instance variables - replace the example below with your own
    private static int MAX_STR = 14;
    private static int MIN_STR = 8;
    private static int MAX_HP = 35;
    private static int MIN_HP = 15;

    /**
     * Constructor for objects of class Dwarf
     */
    public Dwarf()
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
     * Method that creates the Dwarf
     * @param hp are hitpoints for the Dwarf between the range of 8-25
     * @param str is strength for the Dwarf between the range of 8-25
     */
    // public Dwarf(int str, int hp){
        // super(str,hp);
    // }
    
    // creates a 50% chance of the dwarf getting increased damage
    public int rifleDamage(){
        int riflePercent;
        riflePercent = random.nextInt(10)+1; //50% chance
        damageInflicted = super.damage();
        if(riflePercent > 5){
            damageInflicted = 2 * str;
            System.out.println("Dwarf yells: Another Grudge Settled!");
        }else{
            System.out.println("Dwarf yells: For the High King!");
        }
        return damageInflicted;
    }

}