import java.util.Random;
import java.util.ArrayList;

/**
 * class Warhammer - 
 * The Warhammer class is basically where we will have the main task being war
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
    //private Creature Order;
    //private Creature Chaos;
    private Random random = new Random();

    
    /**
     * Adds troops for the two armies. Order gets humans and elves 
     * where choas gets demons, cyberdemons and balrogs.
     * this is created randomly
     */
    public Warhammer (){   
        //adds troops for the forces of Order
        for(int i = 0; i < 60; i++){
            int random = Randomizer.nextInt(10);
            if(random > 6)
            {
                forcesOfOrder.add(new Elf());
            }else{
                forcesOfOrder.add(new Human());
            }
        }
        
        //adds troops for the forces of Chaos
        for(int i = 0; i < 80; i++){
            int random = Randomizer.nextInt(15);
            if(random == 15)
            {
                forcesOfChaos.add(new Balrog());
            }else if(random == 5 || random == 10){
                forcesOfChaos.add(new CyberDemon());
            }
            else{
                forcesOfChaos.add(new Demon());
            }
        }
    }
    public void toWaaagh()
    {
        System.out.println("The battle between the forces of Order and Chaos"
        + "begins, the fate of the world hangs in the balance!");
        while(forcesOfOrder.size() != 0 && forcesOfChaos.size() != 0){
        
        }
    }
    
}
