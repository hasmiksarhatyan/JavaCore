package chapters.chapter5;

public class While {
    public static void main(String[] args) {
        int n=10;
        while(n>0){
            System.out.println("տակտ " + n );
            n--;
        }
        int i, j;
        i=100;
        j=200;
        while (++i<--j);
        System.out.println("mean value "+ i);
    }
}
