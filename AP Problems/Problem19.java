// APCSA 2019 FRQ #3

3) a)

import java.util.*;
public ArrayList<String> getDelimitersList(String[] tokens){
    ArrayList<String> list = new ArrayList<String>();
    for (String token: tokens){
        if ((token == openDel) || (token == closeDel))
            list.add(token);
    }
    return list;
}

b)
import java.util.*;
public boolean isBalanced(ArrayList<String> delimiters){
    int numOfOpen = 0;
    int numOfClose = 0;
    for (int i = 0; i < delimiters.size(); i++){
        if (delimiters.get(i) == openDel)
            numOfOpen++;
        else
            numOfClose++;
        
        if (numOfClose > numOfOpen)
            return false;
    }
    if (numOfClose != numOfOpen)
        return false;
    else
        return true;
}
