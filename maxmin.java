import java.util.*;
class maxmin{
    
    public static void main(String[] args) {
        
        int tab[] = {13,6,7,2,10,9,16,1,20,12,3,15,8,18,4,0,5,14,2,19,11,17};
        
        int min, max, i, j, a, b;
        
        for (i=0; i<tab.length-1; i++) {
            
            for (a=tab.length-1; a>0; a--) {

                int min = i;
                int max = a;
            
                for (j=i+1; j<tab.length; j++) {
                    
                    if (tab[j]<tab[min]) {                    
                        min = j;
                    }
                }
                
                if (min != i) {
                    swap(tab, i, min);
                }
                
                for (b=a-1; b>=0; b--) {
                    
                    if (tab[b]>tab[max]) {
                        max = b;
                    }
                }
                
                if (max != a) {
                    swap(tab, a, max);
                }
                
                
            }

        }
        
    }
    
    public static void swap(int X[], int y, int z) {
        int p = X[y];
        X[y] = X[z];
        X[z] = p;
    }
}