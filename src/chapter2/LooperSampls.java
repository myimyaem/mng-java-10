package chapter2;

public class LooperSampls {
    public static void main(String[] args) {
        
        int x = 1;
        while(x<5)
            System.out.println("x = "+x++);

        int y = 10;
        do
            System.out.println("y = "+y++);
        while(y<10);
        
        // for(int g=0;g<10;g++)
        //     System.out.println("g = "+g);
        for(int g=0;g<10;g++){
            for(int h=1 ;h<=g;h++){
                System.out.print("⭐️");

            }
            System.out.println();
            }
        for(int g=10;g>0;g--){
            for(int h=1 ;h<=g;h++){
                System.out.print("🌟");

            }
            System.out.println();
            }
    }
    
}
