public class App {
    public static void main(String[] args) throws Exception {
        int x = 0;
        int y = 0;
        int z = 0;

        for(z=0; z<5; z++){
            x += (x+y < 3) ? ++x : x++;
            y += (y > 3 || z == 1) ? ++y : y++;
            System.out.printf("Z: %d X: %d Y: %d \n",z,x,y);
        }
    }    
}
