import java.util.*;
class maxmin{
    
    public static void main(String[] args) {
        
        int tab[13,6,7,2,10,9,16,1,20,12,3,15,8,18,4,0,5,14,2,19,11,17]
        
        int min, max, i, j, a, b;
        
        for (i=0, a=tab.length-1; i<tab.length-1, a>0; i++, a--) {         //i looks for min, a looks for max
            
            min = i;
            max = a;
            
            for (j=i+1; j<tab.length; j++) {
                
                if (tab[j]>tab[min]) {                    
                    min = j;
                }
            }
            if (min != i) {
                swap(tab, i, min);
            }
        }
        
    }
    
    public static void swap(X[], y, z) {
        int p = X[y];
        X[y] = X[z];
        X[z] = p;
    }
}