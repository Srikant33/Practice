/**
 * // This is the robot's control interface.
 * // You should not implement it, or speculate about its implementation
 * interface Robot {
 *     // Returns true if the cell in front is open and robot moves into the cell.
 *     // Returns false if the cell in front is blocked and robot stays in the current cell.
 *     public boolean move();
 *
 *     // Robot will stay in the same cell after calling turnLeft/turnRight.
 *     // Each turn will be 90 degrees.
 *     public void turnLeft();
 *     public void turnRight();
 *
 *     // Clean the current cell.
 *     public void clean();
 * }
 */

class Solution {
    public void cleanRoom(Robot robot) {
        int j=1000000;
        while (j>0){
            int i=(int)(Math.random()*10);
            // System.out.println("left");
            robot.turnLeft();
            while (i>0){
                robot.clean();
                if (!robot.move()){
                    // System.out.println("right");
                    robot.turnRight();
                }
                i--;
            }
            j--;
        }
    }
}