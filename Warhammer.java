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
        for(int i = 0; i < 300; i++){
            int random = Randomizer.nextInt(20);
            if(random > 13){
                forcesOfOrder.add(new Elf());
            }else if(random > 6){
                forcesOfOrder.add(new Dwarf());
            }else{
                forcesOfOrder.add(new Human());
            }
        }
        
        //adds troops for the forces of Chaos
        for(int i = 0; i < 300; i++){
            int random = Randomizer.nextInt(20);
            if(random == 20)
            {
                forcesOfChaos.add(new Balrog());
            }else if(random == 10 || random == 15){
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
        
        /**
         * main loop
         * 
        */
        while(forcesOfOrder.size() != 0 && forcesOfChaos.size() != 0){
        
            
            if(order == null){
                order = forcesOfOrder.remove(0); 
            }
            if(chaos == null){
                chaos = forcesOfChaos.remove(0); 
            }
            
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
                System.out.println("A demon is slain, such weakness has no place in demonhood.");
                chaosLosses++;
            }
        }
        System.out.println("");
        System.out.println("Conclusion");

        if(forcesOfOrder.size()>0){
            System.out.println("The forces of Order have" 
            + " won this day, but there are always battles to fight, and wars to wage.");
        }
        
        if(forcesOfChaos.size()>0){
            System.out.println("The forces of Order have" 
            + " fallen, the end times have begun!");
        }
        
        if(forcesOfChaos.size()== 0 && forcesOfOrder.size()== 0){
            System.out.println("In the end," 
            + " death claims us all.(no one wins)");
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