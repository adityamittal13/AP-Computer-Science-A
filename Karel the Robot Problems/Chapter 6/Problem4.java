public void infinitePile() {
  while (nextToABeeper()) {
	  pickBeeper();
	  if (!nextToABeeper()) {
		  turnLeft();
		  move();
		  break;
	  }
    pickBeeper();
    if (!nextToABeeper()) {
      turnLeft();
      turnLeft();
      turnLeft();
      move();
      break;
    }
  } 
  while (nextToABeeper()) {
	  pickBeeper();
  }
}
