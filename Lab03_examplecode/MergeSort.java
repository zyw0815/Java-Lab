class MergeSort{
    
    public static void main(String[] args){
	int[] input = {3, 1, 6, 8, 23, 2, 12};
	mergeSort(input);

	for(int x : input){
	    System.out.print(x + " ");
	}
	System.out.println();
	
    }

    // the method for merge sort
    public static void mergeSort(int[] xs){
	sort(xs, 0, xs.length-1);
	
    }

    // a sort method
    private static void sort(int[] xs, int start, int end){
	// if it cannot be divided anymore, we don't need to sort a single element 
	if(start >= end)
	    return;

	// get the middle index, divide the list into two parts
	int middle = (end + start) / 2;

	// recursively sort the left part
	sort(xs, start, middle);
	// recursively sort the right part
	sort(xs, middle + 1, end);
	// merge the sorted list
	merge(xs, start, middle, end);
    }

    private static void merge(int[] xs, int start, int middle, int end){
	int[] temp = new int[xs.length]; // a temporary list 
	int index = start;
	int left = start;
	int right = middle + 1;

	while(left <= middle && right <= end){
	    // compare each element from left and right
	    if(xs[right] < xs[left]){
		temp[index++] = xs[right++];
	    }else{
		temp[index++] = xs[left++];
	    }
	}

	// if there are elements left in the left list
	while(left <= middle)
	    temp[index++] = xs[left++];

	// if there are elements left in the right list
	while(right <= end)
	    temp[index++] = xs[right++];

	// copy back
	for(int i = start; i <= end; i++){
	    xs[i] = temp[i];
	}

    }
}
