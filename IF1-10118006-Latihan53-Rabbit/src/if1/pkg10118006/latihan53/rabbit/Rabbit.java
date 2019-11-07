 
package if1.pkg10118006.latihan53.rabbit;

/*
 * @author 
 * NAMA  : Alfarizi Rizki Pane
 * KELAS : IF 1
 * NIM   : 10118006
 */
public class Rabbit extends Animal{
    
    private String color;
    private String name;
    
    public Rabbit (String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        
        this.name = name;
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
    
    
    
}
