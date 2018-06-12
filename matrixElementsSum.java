int matrixElementsSum(int[][] matrix) {

	    int cost = 0;
	    for(int i = 0; i < matrix.length; i++ ){
	        for(int j = 0; j < matrix[i].length; j++ ){
	            for(int k = i-1; k >= 0;k--){
	                if(matrix[k][j]==0)
	                {
	                	matrix[i][j] = 0;
	                }
	            }

            	cost = cost + matrix[i][j];



	        }
	    }
	    return cost;
	}
