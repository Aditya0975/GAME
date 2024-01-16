
package gamee;

public class Player {
    String name  ;
    int speed ;
    int HP ;
    int attack;
    int defend;
    int damage;
    int armor;
    
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
    }
    
    void attack(){
        System.out.println(name +" is attacking...");
        System.out.println("damage: "+ damage);
    }
    
    void defend(){
        System.out.println(name +" have defend...");
        System.out.println("defend: "+ armor);
    }
    
    boolean isDead(){
        if(HP <= 0) return true;
        return false;
        
    }
}
