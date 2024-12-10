public class ExemploSintaxe {
    public static void main(String[] args) {
        int x = 1;
        while (x<4){
            System.out.println("O valor de x é: " + x);
            x++;
        }

        //int x = 1;
        for (x=1; x<4; x++){
            System.out.println("X= "+x);
        }

        int i = 1;
        do {
            System.out.println("I = "+ i);
            i++;
        } while (i<=3);
    }
}