package AssistedPractice3;

class RotateArray
{ 
public void rotate(int[] n, int k) {
    		if(k > n.length) 
       			k=k%n.length;
 		int[] res = new int[n.length];
 		for(int i=0; i < k; i++){
        			res[i] = n[n.length-k+i];
 		}
 		int j=0;
    		for(int i=k; i<n.length; i++){
        			res[i] = n[j];
j++;
    		}
 		System.arraycopy( res, 0, n, 0, n.length );
}
} 
public class Main
{
	public static void main(String[] args) {
		RotateArray r = new RotateArray();
        		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        		r.rotate(arr, 5); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}
}