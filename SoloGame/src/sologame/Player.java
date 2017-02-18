
package sologame;


public class Player {
    
 
 private static int HP;
 private static int DMG;
 private static int ARMOR;
 private static int DODGE;
 private static int CRIT;
    
    
public Player(int Class){
  
  if (Class == 0){ // Archer


   setHP(100);
   setDMG(30);
   setARMOR(0);
   setDODGE(4);
   setCRIT(50);
  }
  if (Class == 1){ // Templar
   setHP(150);
   setDMG(20);
   setARMOR(15);
   setDODGE(0);
   setCRIT(0);
  }
  if (Class == 2){ // Warlock
   setHP(80);
   setDMG(30);
   setARMOR(0);
   setDODGE(2);
   setCRIT(0);
   
  }
  if (Class == 3){ // Hitler
   setHP(80);
   setDMG(50);
   setARMOR(0);
   setDODGE(0);
   setCRIT(50);
   
  }
  if (Class == 4){ // Warlock
   setHP(80);
   setDMG(30);
   setARMOR(0);
   setDODGE(2);
   setCRIT(2);
   
  }
  }

    /**
     * @return the HP
     */
    public static int getHP() {
        return HP;
    }

    /**
     * @param aHP the HP to set
     */
    public static void setHP(int aHP) {
        HP = aHP;
    }

    /**
     * @return the DMG
     */
    public static int getDMG() {
        return DMG;
    }

    /**
     * @param aDMG the DMG to set
     */
    public static void setDMG(int aDMG) {
        DMG = aDMG;
    }

    /**
     * @return the ARMOR
     */
    public static int getARMOR() {
        return ARMOR;
    }

    /**
     * @param aARMOR the ARMOR to set
     */
    public static void setARMOR(int aARMOR) {
        ARMOR = aARMOR;
    }

    /**
     * @return the DODGE
     */
    public static int getDODGE() {
        return DODGE;
    }

    /**
     * @param aDODGE the DODGE to set
     */
    public static void setDODGE(int aDODGE) {
        DODGE = aDODGE;
    }

    /**
     * @return the CRIT
     */
    public static int getCRIT() {
        return CRIT;
    }

    /**
     * @param aCRIT the CRIT to set
     */
    public static void setCRIT(int aCRIT) {
        CRIT = aCRIT;
    }
  
 }  
