package com.ruoyi.web.core.tool;
import java.util.BitSet;
public class Bexample {
    public static void main(String[] args) {


        // computerPrime();
        sort();
    }

    //求1024之前的素数
    private static void computerPrime(){
        BitSet sieve = new BitSet(320);
        int size = sieve.size();
        for (int i = 2; i < size; i++) {
            sieve.set(i);
        }
        System.out.println(size);
        int finalBit = (int) Math.sqrt(size);
        System.out.println(finalBit);
        for (int i = 2; i < finalBit; i++) {
            if (sieve.get(i)) {
                System.out.println(i);
                for (int j = 2*i; j < size; j+=i) {
                    sieve.clear(j);

                }
            }
        }

        int counter = 0;
        for (int i = 1; i < size; i++) {
            if (sieve.get(i)){
                System.out.printf("%5d",i);
                if (++counter % 15 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
    private static void sort(){
        int[] a = {12,54,63,10,8,5,6,3,5,4,7,456,8411,21,1};

        BitSet bitSet = new BitSet();
        for (int anA : a) {
            bitSet.set(anA);
        }
        int k = 0;
        int len = bitSet.cardinality();
        int b[] = new int[len];
        for (int i = bitSet.nextSetBit(0); i >=0 ; i = bitSet.nextSetBit(i+1)) {
            b[k++] = i;
        }
        for (int aB : b) {
            System.out.println(aB);
        }
    }
}
