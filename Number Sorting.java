
abstract class Sort implements Comparable<Object>
{
	public static void main(String[] args)
	{
		
		Integer[] intArray = {new Integer(2), new Integer(4),new Integer(3)};
		// Create a Double array
		Double[] doubleArray = {new Double(3.0), new Double(3.3), new Double(-100.1)};
	
		System.out.println( "Unsorted integerArray contains:" );
        printArray( intArray  ); // print an Integer array
        System.out.println( "Unsorted doubleArray contains:" );
        printArray( doubleArray  ); // print a Double array
        
		//call a sort method with an array as a parameter
		sortArray(doubleArray);
		sortArray(intArray);

		System.out.println( "Array integerArray contains:" );
        printArray( intArray  ); // pass an Integer array

        System.out.println( "Array doubleArray contains:" );
        printArray( doubleArray ); // pass a Double array
    }
		
	
		public static < E > void printArray( E[] inputArray )
		   {
		      // Display array elements              
		         for ( E element : inputArray ){        
		            System.out.printf( "%s ", element );
		         }
		         System.out.println();
		    }
		
		
		@SuppressWarnings("unchecked")
		public static < E > void sortArray( E[] inputArray ){
		      // Display array elements    
			
			for (int i = 0; i < inputArray.length - 1; i++) {
				E currentMin =  inputArray[i];
				int currentMinIndex = i;
				for (int j = i + 1; j < inputArray.length; j++){
					if(((Comparable<Object>) currentMin).compareTo(inputArray[j]) == 1) {
				currentMin = inputArray[j];
				currentMinIndex = j;
				}

				}
				if (currentMinIndex != i){
				inputArray[currentMinIndex] = inputArray[i];
				inputArray[i] = currentMin;
				}
			}
				        
		}
		
}