package ArrayMatrix;

public class Array3d {

    public static void main(String[] args) {
        int ar[][][] = new int[2][2][2];
        int ar1[][][] = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}},{{13,14,15},{16,17,18}}};
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {

                for (int k = 0; k < ar.length; k++) 
                {
                    System.out.print(ar[i][j][k]);

                }
                System.out.println();
            }

        }
        for (int i = 0; i < ar1.length-1; i++) {
            for (int j = 0; j < ar1.length-1; j++) {

                for (int k = 0; k < ar1.length-1; k++) 
                {
                    System.out.print(ar1[i][j][k]);

                }
                System.out.println();
            }

        }
        
    }

}
