String[] allLongestStrings(String[] inputArray) {
      int maxLength = 0;
	    int tam = 0;
	    for(int i = 0; i < inputArray.length; i++){
	        if(inputArray[i].length()>maxLength){
	            maxLength = inputArray[i].length();
	        }
	    }
	    for(int i = 0; i < inputArray.length; i++){
	        if(inputArray[i].length()==maxLength){
	            tam++;
	        }
	    }
	    String[] result = new String[tam];
	    int cont = 0;
	    for(int i = 0; i < inputArray.length; i++){
	    	if(inputArray[i].length()==maxLength){
	            result[cont] = inputArray[i];
	            cont++;
	        }
	    }
      return result;
}
