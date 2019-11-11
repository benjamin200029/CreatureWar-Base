import java.util.Random;
import java.util.ArrayList;

/**
 * class Warhammer - 
 * The Warhammer class is basically where we will have main task of war
 * to happen between two armies in this game. 
 * The name is taken from my favorite 
 * fantasy series of Warhammer fantasy, and some of the monsters provided
 * by the course are not really in that world or are named
 * differently but following directions.
 * 
 * 
 * @author Ben Adelson
 * @version (2019-11-10)
 */
public class Warhammer
{
    //instance variables
    private ArrayList<Creature> forcesOfOrder;
    private ArrayList<Creature> forcesOfChaos;
    private Creature Order;
    private Creature Chaos;
    private Random random = new Random();

    
    /**
     * Confstructor for Objects of class Warhammer
     */
    public Warhammer (){
       forcesOfOrder = new ArrayList<Creature>();
       forcesOfChaos = new ArrayList<Creature>();

       
    }
    
    public void toWaaagh()
    {
        System.out.println("The battle between the forces of Order and Chaos"
        + "begins, the fate of the world hangs in the balance!");
        
    }
    
}
