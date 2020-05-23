2) a)
public int compareCustomer(Customer other){
    int val = this.getName().compareTo(other.getName())
    if (val == 0 && this.getID() == other.getID()){
        return 0;
    } else if (val == 0 && this.getID() < other.getID()){
        return -1;
    } else if (val == 0 && this.getID() > other.getID()){
        return 1;
    } else if (val > 0){
        return 1;
    } else if (val < 0){
        return -1;
    }
    return 1;
}

b)
public Customer[] prefixMerge(Customer[] list1, Customer[] list2, Customer[] result){
    int list1index = 0;
    int list2index = 0;
    int resultindex = 0;
    while (resultindex < result.length && list1index < list1.length && list2index.list2.length){
        int val = list1[list1index].compareCustomer(list2[list2index]);
        if (val < 0){
            result[resultindex] = list1[list1index];
            list1index++;
        } else if (val == 0){
            result[resultindex] = list1[list1index];
            list1index++;
            list2index++;
        } else if (val > 0){
            result[resultindex] = list2[list2index];
            list2index++;
        }
        resultindex++;
    }
    
    if (resultindex < result.length){
        if (list1index >= list1.length){
            while (resultindex < result.length){
                result[resultindex] = list2[list2index];
                list2index++;
                resultindex++;
            }
        } else if (list2index >= list2.length){
            while (resultindex < result.length){
                result[resultindex] = list1[list1index];
                list1index++;
                resultindex++;
            }
        }
    }
    
    return result;
}
