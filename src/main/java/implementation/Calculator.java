 package implementation;
 public class Calculator {
    public int sum(int a, int b) {
        return a+b;
    }
    public int minus(int a, int b) {
        return a-b;
    }

    public int divide(int a, int b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException("La division par 0 est impossible");
        return a/b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }
    public int min(int a, int b) { return Math.min(a,b); }
    public int max(int a, int b) {
            return Math.max(a,b);
    }

    public int minElement(int[] list) {
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min)
                min = list[i];
        }
        return min;
    }
    public int maxElement(int[] list) {
        int max=list[0];
        for(int i=1;i<list.length;i++) {
            if(list[i]>max)
                max=list[i];
        }
        return max;
    }
}
