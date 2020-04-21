public void goToOrigin(){
	while (!facingWest()){
		turnLeft();
	}
	while (frontIsClear()){
		move();
	}
	turnLeft();
	while (frontIsClear()){
		move();
	}
	turnLeft();
}
