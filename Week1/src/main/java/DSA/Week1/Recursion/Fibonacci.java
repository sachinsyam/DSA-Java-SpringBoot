package DSA.Week1.Recursion;

import org.springframework.stereotype.Component;

@Component
public class Fibonacci {
    //1 1 2 3 5 8 13
    public void run(int first, int second, int lim){
        if(lim>0){
            System.out.printf(first+" ");
            run(second, first+second, lim-1);
        }
    }
}