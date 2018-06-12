int makeArrayConsecutive2(int[] statues) {
    int min = statues[0];
    int max = statues[0];
    for(int i = 1; i<statues.length; i++){
        if(min>statues[i]){
            min = statues[i];
        }
        if(max<statues[i]){
            max = statues[i];
        }
    }
    return (max-min-1)-(statues.length-2);
}
