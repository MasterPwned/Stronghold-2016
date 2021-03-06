# Stronghold-2016
Code for FRC Robotics team 3695.
# How to use GitHub Presentation
[drive.google.com](https://docs.google.com/presentation/d/1c2I2dRhcj-hvn5ArNstm2tBm8RZz-9yyLwL01LYOvZs/edit?usp=sharing)

## Code Style and Format
- Methods should be in camelCase.
- Variables should be in camelCase.
- Classes should be in BumpyCase.
- Make sure that your IDE uses tabs, not spaces.
- Static variables should be in CAPS_LOCK.
- Please make sure to add Javadoc to your methods and static variables. 
- Example:
```Java
/**
 * I/O number for the arm of the robot.
 */
public static final int ROBOT_ARM = 10;

/**
 * This method kills the robot. Do not attempt to
 * kill the robot.
 */
public boolean doMagicalThing(int magic) {
  Robot r = new Robot();
  r.kill();
  r.haltAndCatchFire(true);
  return magic > 0;
}
```

##Contributors (Program Team 2016)
- AJ Walters
- Kurtis Bowen
