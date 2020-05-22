1) a) 
private double average(int first, int last){
    int count = 0;
    int sum = 0;
    for (int i = first; i <= last; i++){
        count++;
        sum += scores[i];
    }
    return (double) sum/count;
}

b)
private double hasImproved(){
    for (int i = 1; i < scores.length; i++){
        if (scores[i] < scores[i-1])
            return false;
    }
    return true;
}

c)
public double finalAverage(){
    if (hasImproved()){
        return average(scores.length/2, scores.length-1);
    } else {
        return average(0, scores.length-1);
    }
}
