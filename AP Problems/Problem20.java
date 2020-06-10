1) a)

public Player requestSlot(String playerName){
    for (int i = 0; i < slots.length; i++){
        if (slots[i] == null){
            Player player = new Player(playerName, i);
            slots[i] = player;
            return player;
        }
    }
    waitingList.add(playerName);
    return null;
}

b)
public Player cancelAndReassignSlot(Player p){
    for (int i = 0; i < slots.length; i++){
        if (p.equals(slots[i])){
            slots[i] = null;
            if (waitingList.size() == 0)
                return null;
            else {
                slots[i] = new Player(waitingList.remove(0), i);
                return slots[i];
            }
        }
    }
    return null;
}
