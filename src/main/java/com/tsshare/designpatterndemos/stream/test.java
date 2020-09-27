package com.tsshare.designpatterndemos.stream;

/**
 * @author chenzhenfei
 * @title: test
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/4/130:20
 */
public class test {
    public static void main(String[] args) {
       int[] a =new int[]{7,8,5,6,9,3};
       quickSort(a,0,a.length-1);
       for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
       }
    }
    public static void quickSort(int[] a,int i,int j){
        if(a==null||a.length==0){
            return ;
        }
        int k =a[i];
        while(i<j){
            while(i<j&&a[i]<=k){
                i++;
            }
            while(i<j&&a[j]>=k){
                j--;
            }
            if(i<j){
                k = a[i];
                int swap =a[j];
                a[j] =a[i];
                a[i]= swap;
            }
        }
        quickSort(a,i+1,a.length-1);
        quickSort(a,0,i-1);
    }



    public static void mpsort(int[] a){
        if(a==null||a.length==0){
            return ;
        }
        for (int i = 0; i <a.length ; i++) {
            int min = a[i];
            for (int j = i+1; j <a.length ; j++) {
                if(a[j]<=min){
                    min =a[j];
                    int swap = a[j];
                    a[j]=a[i];
                    a[i]=swap;
                }
            }
        }
    }

}
