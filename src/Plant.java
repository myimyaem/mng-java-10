/**
 * Plant class has numberOfLeaves
 * {@code Plant}
 * @author Marco Yimyaem
 * @since 2023
 */
public class Plant {
    int numberOfLeaves;
    int branch;
    int flower;
    int fruit;
    int root;
    String[] habitat = {"Terrestrial","aerial","Aquatic"};
    String name;

    public static void main(String[] marco) {
        System.out.println("Hello Plant ");
    }

//    create a flower if leaves is greater than 5 and
//    create fruit if flower is greater than 3
    public void createFlower(int leaves){
        if(leaves>=5){
            this.flower++;
        }
        createFruit(this.flower);
    }
    public void createFruit(int flower){
        if(flower>=3){
            this.fruit++;
        }
    }
}
class Grass1{}
class Grass2{}
class Fern{}
