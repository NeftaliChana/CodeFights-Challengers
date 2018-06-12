boolean almostIncreasingSequence(int[] sequence) {
    int count = 0;
    int pos = 1;

    for (int i = 1; i < sequence.length; i++) {
        if (sequence[i - 1] >= sequence[i]) {
            count++;
            pos = i;
        }

        if (count > 1)
            return false;
    }

    if (count == 0)
        return true;

    if (pos == 1 || pos == sequence.length - 1)
        return true;
    else
        if (sequence[pos - 1] < sequence[pos+1] || sequence[pos - 2] < sequence[pos])
            return true;

    return false;

}
