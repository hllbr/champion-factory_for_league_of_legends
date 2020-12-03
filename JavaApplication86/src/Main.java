
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to champion factory");
        System.out.println("press q to exit");
        Scanner scn = new Scanner(System.in);
          while (true) {   
            System.out.println("what kind of champion do you want to produce");
              System.out.println("The species we have are conspirator, tank, Sniper, Support, Jungle");
            String islem = scn.nextLine();
            if(islem.equals("q")){
                System.out.println("exiting the program...");
                break;
            }else{
                championWorkshop chaWorkshop = new championWorkshop();
                Champions champions = chaWorkshop.produceChampion(islem);//polymorphsim
                if(champions == null){
                    System.out.println("please select a producable champion");
                }else{
                    champions.showdata();
                    champions.placeatotemonthebush();
                    champions.use_ult();
                }
            }
          }
    }
    
}
