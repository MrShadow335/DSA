import java.util.*;

/**
 * q8
 */
class Pokemon{
    private int power;
    String type;
    Pokemon(){}
    Pokemon(String type, int power){
        this.type = type;
        this.power = power;
    }
    Pokemon(int power, String type){
        this.type = type;
        this.power = power;
    }
    int getPower(){
        return power;
    }
    void print(){//getter
        System.out.println(this.power+" "+this.type);
    }
}
public class q8 {
    public static void main(String[] args){
        Pokemon Pikachu = new Pokemon("Elevtric", 70);
        Pikachu.type ="fire";
        Pokemon jiggypuff = new Pokemon(50, "Fairy");
        System.out.println(Pikachu.getPower());
        Pikachu.print();
        jiggypuff.print();
        
}
    
}