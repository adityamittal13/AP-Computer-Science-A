//Page 202 of AP Computer Science A Course and Exam Description

1) a)

public int countElectronicsbyMaker(String maker){
    int count = 0;
    for (int i = 0; i < purchases.size(); i++){
        if ((purchases.get(i).getMaker().equals(maker)) && purchases.get(i).isElectronic()){
            count++;
        }
    }
    return count;
}

b)
public boolean hasAdjacentEqualPair(){
    for (int i = 0; i < purchases.size()-1; i++){
        if (purchases.get(i).equals(purchases.get(i+1)))
            return true;
    }
    return false;
}

