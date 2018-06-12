int adjacentElementsProduct(int[] inputArray) {
    int min = inputArray[0];
    for(int i = 1; i < inputArray.length; i++){
        if(inputArray[i] < min){
            min = inputArray[i];
        }
    }
    int largest = min;
    for(int i = 0; i < inputArray.length-1; i++){
            int product = inputArray[i]*inputArray[i+1];
            if(largest<product){
                largest = product;
            }else if(inputArray.length==2){
                largest = inputArray[i]*inputArray[i+1];
            }
    }
    return largest;
}
