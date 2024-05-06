package sim0506;

import java.util.Arrays;

public class TestClass1 {

    
    public static void main(String[] args) {
    	                      
        int[][] matrix = new int[2][3];
        
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        		
		for (int[] m : matrix) {
			System.out.println(Arrays.toString(m));
		}
		
		System.out.println("*************");
		
		int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9,10,11,12}};
		
		for (int[] m :matrix2) {
			System.out.println(Arrays.toString(m));
			for ( int i: m)
				System.out.println(i);
		}
		
		System.out.println("matrix3");
		int[][][] matrix3 = {{{1,2,3},{4,5,6},{7,8,9,10,11,12}},
							{{11,12,13},{14,15,16},{17,18,19,20,21,22}}};
		
		for (int[][] m1 :matrix3) {
			System.out.println(Arrays.toString(m1));
			for ( int[] m2: m1) {
				System.out.println(Arrays.toString(m2));
				for ( int i: m2) {
					System.out.println(i);
				}
			}
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