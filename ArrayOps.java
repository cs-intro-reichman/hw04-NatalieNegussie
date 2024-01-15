public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
		int size = array.length;
		if (size == 1)
			return 1;
		int j=0, count=0;
		while(j<=size){
			for(int i=0; i<size; i++){
				if(array[i]==j){
					count++;
				}
			}	
			if(count==0){
				return j;	
			}
		count=0;
		j++;	
		}
		return 1;
    }

    public static int secondMaxValue(int [] array) {
        int maxVal=0, indexMax, secondMax=0;
		int size = array.length;
        for(int i=0; i<size; i++){
			if(array[i] >= maxVal){
				secondMax=maxVal;
				maxVal= array[i];
				indexMax = i;
			}	
		}
		return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
		int count=0;
        for(int i=0; i<array1.length; i++){
			count=0;
			for(int j=0; j<array2.length; j++){
				if(array1[i]==array2[j]){
					count++;
				}
			}
			if(count==0){
				return false;
			}	
		}	
        return true;
    }

    public static boolean isSorted(int [] array) {
        int size = array.length;
		if(size==1||size==2){
			return true;
		}
		int first = array[0];
		int second = array[1];
		if(first<=second){
			for(int i=0; i<size-1; i++){
				if(array[i]>array[i+1])
					return false;
			}
		}
		else{
			for(int i=0; i<size-1; i++){
				if(array[i]<array[i+1])
					return false;
			}
		}	
        return true;
    }

}
