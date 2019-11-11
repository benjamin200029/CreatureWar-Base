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
    private ArrayList<Creature> forcesOfOrder = new ArrayList<Creature>();
    private ArrayList<Creature> forcesOfChaos = new ArrayList<Creature>();
    
    /**
     * Adds troops for the two armies. Order gets humans and elves 
     * where choas gets demons, cyberdemons and balrogs.
     * this is created randomly
     */
    public Warhammer (){   
        //adds troops for the forces of Order
        for(int i = 0; i < 60; i++){
            int random = Randomizer.nextInt(10);
            if(random > 7)
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
    
    /**
     * Where the battle between the the two forces begin and will choose 
     * the winner and the loser of the fight
     */
    
    public void toWaaagh()
    {
       int orderLosses = 0;
       int chaosLosses = 0;
       Creature order = null;
       Creature chaos = null;

        System.out.println("The battle between the forces of Order and Chaos"
        + " begins, the fate of the world hangs in the balance!");
        while(forcesOfOrder.size() != 0 && forcesOfChaos.size() != 0){
        
            order = forcesOfOrder.get(0);
            chaos = forcesOfChaos.get(0);
            
            while(order.isAlive() && chaos.isAlive()){
                order.takeDamage(chaos.damage());
                chaos.takeDamage(order.damage());
            }
            
            if(order.isDead())
            {
                order = null;
                System.out.println("May Sigmar bless this fallen comrade.");
                orderLosses++;
            }
            
            if(chaos.isDead())
            {
                chaos = null;
                System.out.println("A demon is slain, and embraces demonhood.");
                chaosLosses++;
            }
        }
        System.out.println("Conclusion");

        if(forcesOfOrder.size()>0){
            System.out.println("The forces of Order have" 
            + " won this day, but there are always battles to fight, and wars to wage.");
        }
        
        if(forcesOfChaos.size()>0){
            System.out.println("The forces of Order have" 
            + " fallen, the end times have begun!");
        }
        // results
        System.out.println("");
        System.out.println("War Report");
        System.out.println("The forces of Order had an army of "
        + forcesOfOrder.size() + " and lost " + orderLosses);
        System.out.println("The forces of Chaos had an army of "
        + forcesOfChaos.size() + " and lost " + chaosLosses);
    }
}