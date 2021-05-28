/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class SuperClass_Parent {
    //Polymorphism
    public double ChickenBurger; 
    public double ChickenBurgerM;
    public double BaconCheeseBurger;
    public double Filet_O_Fish;
    
    public double MilkShake;
    public double VanMilkShake;
    public double ChocMilkShake;
    public double ClasVanilla;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;

    
    public double GetAmount()
    {
        Meals = ChickenBurger + ChickenBurgerM + BaconCheeseBurger + 
                Filet_O_Fish;
        Drinks = MilkShake + VanMilkShake + ChocMilkShake + ClasVanilla;
        TotalofMD = Meals + Drinks;
        AllTotalofMD = TotalofMD; 
        return AllTotalofMD + Drinks;
    }
    
    private JFrame frame;
    
     public void iExitSystem(){
         frame = new JFrame("Exit"); 
         
         if (JOptionPane.showConfirmDialog(frame, "Confirm if you want "
                 + "to exit","Restaurant Management Systems",
                 JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
             System.exit(0);
         }
     }


     //=========Price=========================================
    public double pChickenBurger = 25000;
    public double pChickenBurgerM = 30000;
    public double pBaconCheeseBurger = 23000;
    public double pFilet_O_Fish = 25000;
    
    public double pMilkShake = 15000;
    public double pVanMilkShake = 17000;
    public double pChocMilkShake = 17000;
    public double pClasVanilla = 13000;
     
     //==========================Tax=====================================
    
    public double mcTax = 0.01;
    
    public double cFindTax (double cAmount){
        double FindTax = (cAmount * mcTax);
        return FindTax;
    }
    //=================================================================
}
