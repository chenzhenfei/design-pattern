package com.tsshare.designpatterndemos.taipingyang;

/**
 * @author chenzhenfei
 * @title: TryCatchFinally
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/10/2122:15
 */
public class TryCatchFinally {

    public static void main(String[] args) {
//        int in = 1;
//        try {
//            in = 2;
//            int i = 1 / 0;
//        } catch (
//                Exception e
//        ) {
//            in = 3;
//        } finally {
//            in = 4;
//        }
//        System.out.println(in);

        System.out.println(testReturnFinally());
    }

    private static int testReturnFinally() {
        int in = 1;
        try {
            in = 2;
            int i=1/0;
            return in;
        } catch (Exception e) {
            in = 3;
            return in;
        } finally {
            in = 4;
            return in;
        }
    }


}
