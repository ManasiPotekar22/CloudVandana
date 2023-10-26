package CloudAssignment;


	import java.io.*;
	import java.util.*; 
	class ArrayShuffle {


	public static void main(String[] args){
	int arr[]= {1,2,3,4,5,6,7};

	shuffleArray(arr);

	}
	public static void shuffleArray(int[] array)
	{
	    int index, temp;
	    Random random = new Random();
	    for (int i = array.length - 1; i > 0; i--)
	    {
	        index =random.nextInt(i + 1);
	        temp = array[index];
	        array[index] = array[i];
	        array[i] = temp;
	    }
	for(int i=0;i<array.length;i++){
	System.out.println(array[i]);
	}
	}

	}

	


