public class ex13 {
    public static void main(String[] args) {
        int i,j,k,a,b,c;
        for (i =0 ;i<4 ; i++){
            for (j =0 ;j<i ; j++ ){
                System.out.print("  ");

            }
            for (k= 0; k<=(10-2*i); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 1; i < 4; i++) {
            for ( j = 3; j > i; j--) {
                System.out.print("  ");
            }
            for ( k = 0; k < 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }




    }
}