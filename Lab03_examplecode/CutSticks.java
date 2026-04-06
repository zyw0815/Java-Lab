class CutSticks{
    public static void main(String[] args){
	int[] sticks = {2, 3, 5, 5, 2, 1, 6};
	// sort the sticks
	MergeSort.mergeSort(sticks);
	int current = sticks[0];

	for(int i = 1; i < sticks.length; i++){
	    if(current != sticks[i]){
		System.out.println(sticks.length - i);
		current = sticks[i];
	    }
	}
	System.out.println(0);
	
    }
}
