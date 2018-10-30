/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;
import java.util.ArrayList;
/**
 *
 * @author rh0864054
 */
public class Poly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HEYY");
        
        
        Dog Peanut = new Dog(10,"tan");
        Fish Dale = new Fish(2,"red");
        Lion Simba= new Lion(1,"orange");
        
        ArrayList<Animal> aryAnimal = new ArrayList<Animal>();
        
        aryAnimal.add(Peanut);
        aryAnimal.add(Dale);
        aryAnimal.add(Simba);
        
        for(int i =0; i <aryAnimal.size(); i++){
            allSpeak(aryAnimal.get(i));
        }
        
        
    }
        
        public static void allSpeak(Animal animal){
             animal.speak();
        }
}
