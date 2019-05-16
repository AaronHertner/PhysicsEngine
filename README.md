# PhysicsEngine
A physics engine for golf. 

## Source Code  
Environment.java  
Object.java (abstract)  
Ball.java (extends Object)   
Test.java (main())  
Club.java  

## Purpose  
To explore and have fun with the different underlying mechanics seen in simple physical interactions such as a golfer hitting a golfball.


## Updates  
- Added a function (drop()) that calculates the time it takes for an object to fall, and keeps track of its speed.  
- Added a function (roll()) currently a work in progress. Will calculate time it takes for an object to roll down a ramp, or if it rolls at all.  
- Added a Club class which is simple for now, applies acceleration to the ball.
- Added a Golfer class which will contain club objects and will keep track of its own score.
