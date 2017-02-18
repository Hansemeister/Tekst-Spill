
package sologame;

public class Enemy {
 
 private static String NAME;   
 private static int HP;
 private static int DMG;
 private static int ARMOR;
 private static int DODGE;
 private static int CRIT;
    
    
public Enemy(int Class){
  
  if (Class == 0){ 
   setNAME("Zombie");
   setHP(100);
   setDMG(30);
   setARMOR(0);
   setDODGE(0);
   setCRIT(0);
  }
  if (Class == 1){ 
   setNAME("Skeleton");
   setHP(150);
   setDMG(20);
   setARMOR(0);
   setDODGE(0);
   setCRIT(0);
  }
  if (Class == 2){
   setNAME("Frodo");
   setHP(80);
   setDMG(30);
   setARMOR(0);
   setDODGE(0);
   setCRIT(0);
   
  }
  if (Class == 3){ 
   setNAME("Gygrid");
   setHP(80);
   setDMG(50);
   setARMOR(0);
   setDODGE(0);
   setCRIT(50);
   
  }
  if (Class == 4){ 
   setNAME("Voldemort");
   setHP(40);
   setDMG(30);
   setARMOR(0);
   setDODGE(0);
   setCRIT(0);
   
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

    /**
     * @return the NAME
     */
    public static String getNAME() {
        return NAME;
    }

    /**
     * @param aNAME the NAME to set
     */
    public static void setNAME(String aNAME) {
        NAME = aNAME;
    }
  
 }  


 
