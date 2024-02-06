package org.mutation;

public class Calculation {

    public int add(int a, int b) {
        return a+b;
    }
    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) {
        return a/b;
    }

    public int summation(int sumNum) {
        int retval = 0;
        while(sumNum >= 0) {
            retval += sumNum;
            sumNum --;

        }
        return retval;
    }
}
