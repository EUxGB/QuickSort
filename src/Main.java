import java.sql.SQLOutput;

public class Main {

    public static int[] sortQ(int[] a1, int[] a2) {
        int j = 0;
        int[] a1a2 = new int[a1.length + a2.length];

        for (int i = 0; i < a1.length; i++) {
            a1a2[i] = a1[i];
        }

        for ( int i = a1.length ; i < a1.length + a2.length; i++) {

            a1a2[i] = a2[j];
            j++;
        }


       // int[] ints = new int[5];
        return a1a2;
    }


    public static void main(String[] args) {
        int N1 = 5;
        int N2 = 5;
        int[] n1 = new int[N1];
        int[] n2 = new int[N2];
        int[] n3 ;

        for (int i = 0; i < n1.length; i++) {
            n1[i] = i;
        }

        for (int j = 0; j < n2.length; j++) {
            n2[j] = j;
        }

        n3 = sortQ(n1,n2);

        for (int k = 0; k < n1.length+n2.length; k++) {
            System.out.println(n3[k]);
        }

    }


}
