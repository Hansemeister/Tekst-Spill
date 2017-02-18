
package sologame;

import java.util.Random;
import java.util.Scanner;


public class SoloGame {
    
        static int playerclass;
            
        static boolean enemykilled = false;  
        static boolean running = true;
        
        static int playerMAXHP;
        static int itemArrows           = 5 ;// starting arrow amount = 5
        static int itemArrowsDamage     = 15;
        static int itemArrowsDropChance = 33; //33% dropchance per kill
        static int itemHealthPotion     = 3 ; // Starting hp pot number
        static int itemHealthPotionHealAmount = 25;
        static int itemHealthPotionDropChance = 33; // 33% dropchance per kill

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);  // velg scanner #2 og trykk alt-enter. Scanneren fungerer som inputen i spillet (press 1...)
        Random rand = new Random();           // random verdien i spillet
        
        
        boolean running = true;       
        
        // Tenker å ha "religion" typ greie. Du starter gamet og spillet spørr deg en rekke spørsmåli som bestemmer hva slags stats og bonuser du starter med
        // 1.Are you a worshipper of Artemis, the god of archery and agility? -- Gir flere piler og høyere dodge-chance
        // 2.Are you a templar, knight of the Order and worshipper of Kando?
        // 3.Are you a warlock, apostle of darkness and worshipper of Kel'zut?
        
        // if 1 = give [itemArrow] + 5 --- if 2 = give [weapon]=sword + (playerAttackdDamage +10) ---   if 3 = give [itemOccultDagger]
        
    
        
        System.out.println(">You wake up...");
         
        System.out.println ("Choose who you are :\n 0.Archer\n 1.Templar\n 2.Warlock\n Press i for info about the classes");
        
                String Classchoice  = in.nextLine();
                if (Classchoice.equals("i")){
                    System.out.println ("0.Are you a wanderer, worshipper of Artemis, the god of archery and agility?\n1.Are you a templar, knight of the Order and worshipper of Kando?\n2.Are you a warlock, apostle of darkness and worshipper of Kel'zuth?");
                    Classchoice  = in.nextLine();
                    
                }
                
                int classchoice     = Integer.parseInt(Classchoice);
                while (classchoice >= 4){
                    System.out.println("You are retarded, try again"); 
                    Classchoice     = in.nextLine();
                    classchoice     = Integer.parseInt(Classchoice);
                   
                }
                
                 
                playerclass     = classchoice;
        Player player = new Player(classchoice); 
        playerMAXHP = player.getHP();
            //int playerdamage = player.getDMG();
            //int playerarmor  = player.getARMOR();
            //int playerHealth     = player.getHP();
            //int playerCRIT   = player.getCRIT();        
                
            running = true;       
           
            
        GAME:
        while(running) {
            
            if (enemykilled == false) { 
            Combat();}
            System.out.println("Hello world");
            break;
         
        }      
        
    }
    
    
    public static void Combat() {
        
         //boolean running = true;        
        
        Scanner in = new Scanner(System.in);  // velg scanner #2 og trykk alt-enter. Scanneren fungerer som inputen i spillet (press 1...)
        Random rand = new Random();           // random verdien i spillet
        
        int e = rand.nextInt(5);
            Enemy enemy = new Enemy(e);
           
            //String monstername = enemy.getNAME();
            //int monsterhealth = enemy.getHP();
            //int monsterarmor = enemy.getARMOR();
            //int monsterdamage = enemy.getDMG();
            
            

            
            System.out.println("\t> A wild " + enemy.getNAME() + " appears!");
            while (enemy.getHP() > 1 ) { //mens hpen til fienden er mer enn null, så gjør vi--- options
                System.out.println ("\n\tYour HP: " + Player.getHP());
                System.out.println ("\t" + enemy.getNAME() + "'s HP:  " + enemy.getHP()  );
                System.out.println("--------------------------------------------");
                System.out.println ("\n\tWhat would you like to do?"); // "\n" skaper en linebreak, \t lager space
                System.out.println ("\t1. Attack");
                System.out.println ("\t2. Drink health potion");
                System.out.println ("\t3. Run!");
                if (playerclass == 0) {                    
                                   System.out.println ("\t4. Shoot an arrow!");
                } 
                if (playerclass == 1) {
                    System.out.println("\t4. Throw holy water ");
                    
                }
 
                
                
                String input = in.nextLine();   // String input gjør  hvaenn brukeren taster inn--
                System.out.println("--------------------------------------------");
                if (input.equals ("1")){

                	System.out.println(Player.getDMG());
                    int damageDealt = (rand.nextInt(Player.getDMG())-enemy.getARMOR());    
                    System.out.println(damageDealt);

                    
                    int crit = rand.nextInt(100);
                    if (crit < Player.getCRIT()){ 
                        System.out.print("\t> You critically strike the enemy!\n");
                        damageDealt = damageDealt*2;
                    }
                    
                    if  (damageDealt < 0)  {
                        damageDealt = 0;
                        System.out.println("\tYou missed!");
                    }
                    int damageTaken = (rand.nextInt(enemy.getDMG()))- Player.getARMOR();
                    if  (damageTaken < 0){
                        damageTaken = 0;
                        System.out.println("\t>You blocked perfectly!" );
                    }
                    
                    enemy.setHP(enemy.getHP() - damageDealt);
                    Player.setHP(Player.getHP() - damageTaken);
                    
                   
                    System.out.println("\t> You strike the " + enemy.getNAME() + " for " + damageDealt + "damage.");
                    System.out.println("\t> You take " + damageTaken + " damage from " + enemy.getNAME());
                    
                  if (Player.getHP() < 1) { 
                      System.out.println("\n\t> Your injuries force you to the ground, you are no longer able to continue."); 
                      running = false;
                      // fikk ikke helt til det her atm - Bare forcer exit
                      System.exit(0);
                  } 

                      
                  if (enemy.getHP() < 1) {
                      System.out.println("\t> The " + enemy.getNAME() + " was killed!");
                      enemykilled = true;
                      break; 
                  }
                    
                }
                else if (input.equals ("2")){
                    if (itemHealthPotion > 0) {
                        if (    (Player.getHP() + itemHealthPotionHealAmount) > playerMAXHP){
                            Player.setHP(playerMAXHP);                        } 
                        else {
                            Player.setHP(Player.getHP() + itemHealthPotionHealAmount);
                        }
                        itemHealthPotion--;
                        System.out.println("\t> You drink a health potion, healing yourself for " + itemHealthPotionHealAmount + " health! "
                                            + "\n\t> You now have " + Player.getHP() + " health!" +
                                             "\n\t> You have " + itemHealthPotion + " Health potions left.\n");      
                    }   
                    
                    else {
                        System.out.println("\t> You have no Health potions left! Defeat more enemies to gain more");
                        }
                    
                }
                
                else if (input.equals ("3")){
                    System.out.println("\t> You run away from the " + enemy.getNAME() + "!");
                    continue;
                    
                }
                else {
                    System.out.println("\t Invalid command!");
                }
            }
    }
  
   }