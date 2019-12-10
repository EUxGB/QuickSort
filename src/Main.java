import java.sql.SQLOutput;

public class Main {

    public static int[] split (int[] a1, int[] a2) {
        int j = 0;
        int[] a1a2 = new int[a1.length + a2.length];

        for (int i = 0; i < a1.length; i++) {
            a1a2[i] = a1[i];
        }

        for (int i = a1.length; i < a1.length + a2.length; i++) {

            a1a2[i] = a2[j];
            j++;
        }
        return a1a2;
    }

    public static int[] sortQ (int[] a1a2, int first, int last) {
        int i = first;
        int j = last;
        int pivot = j/2;



        while ( i < j ) {

            while (i < pivot && (a1a2[i] < a1a2[pivot])) {
                i++;
            }

            while (j > pivot && (a1a2[j] > a1a2[pivot])) {
                j--;


            }


            if (i <= j) {
                int temp = a1a2[i];
                a1a2[i] = a1a2[j];
                a1a2[j] = temp;
                i++;
                j--;


                if (i == pivot)
                    pivot = j;
                else if (j == pivot)
                    pivot = i;

            }
        }
        sortQ(a1a2);
        //doSort(cur+1, end);



        // int[] ints = new int[5];
        return a1a2;
    }


    public static void main(String[] args) {
        int N1 = 5;
        int N2 = 5;
        int[] n1 =  {9,3,5,1,4};
        int[] n2 = {1,0,5,9,7};
        int[] n3;





//        for (int i = 0; i < n1.length; i++) {
//            n1[i] = i;
//        }
//
//        for (int j = 0; j < n2.length; j++) {
//            n2[j] = j*2-5;
//        }


        n3 = split (n1, n2);
        n3 = sortQ(n3);

        for (int k = 0; k < n1.length + n2.length; k++) {
            System.out.print(n3[k]);
        }

    }


}
