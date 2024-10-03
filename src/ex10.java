public class ex10 {
    public static void main(String[] args) {
        int tong=0;
        for ( int i=0; i<=100; i++){
            if (i %7==0) {
                tong += i;
            }
        }
        System.out.println(tong);
    }
}
