
package gamee;


public class Gamee {

        public static void main(String[] args) {

        // membuat objek player
        Player hero = new Player();
        Player enemy = new Player ();

        // mengisi atribut player
        hero.name = "KJS";
        hero.speed = 40;
        hero.HP = 3000  ;
        hero.damage = 400;
        hero.armor = 200;
        
        enemy.name = "Julianto";
        enemy.speed = 40;
        enemy.HP = 4000  ;
        enemy.damage = 300;
        enemy.armor = 150;

        // menjalankan method
        hero.run();
        hero.attack();
        hero.defend();
        hero.attack(enemy.name);
        enemy.run();

        if(hero.isDead()){
            System.out.println("DEFEAT!!!");
        
        }}}
    

