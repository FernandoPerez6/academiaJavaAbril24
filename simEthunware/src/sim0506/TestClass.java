package sim0506;

import java.util.Arrays;

public class TestClass {

    
    public static void main(String[] args) {
    	                      
        int[][] matrix = new int[2][3];
        
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        
		//System.out.println(matrix.length);
		
		for (int x=0; x< matrix.length; x++ ) {
			System.out.println(Arrays.toString(matrix[x]));
		}
		
		System.out.println("*************");
		
		int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9,10,11,12}};
		
		for (int z=0; z< matrix2.length; z++ ) {
			System.out.println(Arrays.toString(matrix2[z]));
		}
		
		
	}
    
    
    
//    int a[] = {1, 2, 3};
//    int b[] = {4, 5, 6};
//            
//    public int compute(int x, int y){
//        //1 : Insert Line of Code here
//    }
//    
//    public void loadMatrix(){
//    	//                 
//        for(int x=0; x<matrix.length; x++){
//            for(int y=0; y<matrix[x].length; y++){
//                //2: Insert Line of Code here
//            }
//        }
//    }
}