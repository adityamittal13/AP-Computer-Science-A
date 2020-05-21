2)a)

public Reservation requestRoom(String guestName){
    for (int i = 0; i < rooms.length; i++){
        if (rooms[i] == null){
            Reservation reservation = new Reservation(guestName, i);
            rooms[i] = reservation;
            return reservation;
        }
    }
    waitList.add(guestName);
    return null;
}

b)
public Reservation cancelAndReassign(Reservation res){
    if (waitList.size() == 0){
        rooms[res.getRoomNumber()] = null;
        return null;
    } else{
        Reservation reservation = new Reservation(waitList.get(0), res.getRoomNumber());
        room[res.getRoomNumber()] = reservation;
        waitList.remove(0);
        return reservation;
    }
}
