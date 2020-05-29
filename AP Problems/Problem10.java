1) a)

public int getDuration(){
    if (flights.size() == 0){
        return 0;
    } else {
        return flights.get(0).getDepartureTime().minutesUntil(flights.get(flights.size()-1).getArrivalTime());
    }
}

b) 
public int getShortestLayover(){
    if (flights.size() == 0 || flights.size() == 1){
        return -1;
    }
    
    int minLayover = Integer.MAX_VALUE;
    for (int i = 0; i < flights.size()-1){
        if (minLayover > flights.get(i).getArrivalTime().minutesUntil(flights.get(i+1).getDepartureTime())){
            minLayover = flights.get(i).getArrivalTime().minutesUntil(flights.get(i+1).getDepartureTime());
        }
    }
    return minLayover;
}
