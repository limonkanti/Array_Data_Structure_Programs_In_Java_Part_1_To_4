
package ArrayInterViewCode;

import java.util.HashSet;


public class Duplicator {

public static void main(String[] args) {

    int[] a = {3,5,5,8,9,9,9};

    HashSet<Integer> hash = new HashSet<Integer>();

    for(int i = 0; i < a.length; i++){

        for(int j = i+1; j< a.length; j++){

            if(a[i] == a[j]){

                hash.add(a[i]);

            }
        }


    }

    System.out.println(hash);

    }
}