4) a)

public boolean conflictsWith(Appointment other){
    return this.getTime().overlapsWith(other.getTime());
}

b) 
public void clearConflicts(Appointment appt){
    for (int i = 0; i < apptList.size(); i++){
        if (appt.conflictsWith(apptList.get(i)))
            apptList.remove(i);
            i--;
    }
}

c)
public boolean addAppt(Appointment appt, boolean emergency){
    if (emergency){
        clearConflicts(appt);
        apptList.add(appt);
        return true;
    } else {
        for (int i = 0; i < apptList.size(); i++){
            if (appt.conflictsWith(apptList.get(i)))
                return false;
        }
        apptList.add(appt);
        return true;
    }
}

