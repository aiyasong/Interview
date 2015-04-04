package leetcode;

public class Power {
    public static double pow(double x, int n) {
    	double base = x;
    	double result = 1.0;
    	int remaining = n;
    	while (remaining > 0) {
    	    int i = remaining & 1;
    	    remaining = remaining >> 1;
    	    if (i > 0) {    	    	
    	    	result *= base;
    	    }
    	    base = base * base;   
    	}
    	
    	return result;
    }

}
