3) a)

public int numWordsofLength(int len){
    int count = 0;
    for (int i = 0; i < myList.size(); i++){
        if (myList.get(i).length() == len)
            count++;
    }
    return count;
}

b) 
public void removeWordsofLength(int len){
    for (int i = 0; i < myList.size(); i++){
        if (myList.get(i).length() == len){
            myList.remove(i);
            i--;
        }
    }
}


