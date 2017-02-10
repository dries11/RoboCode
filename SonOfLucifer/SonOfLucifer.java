package ries.dan;

import robocode.*;
import java.awt.*;

/**
 * Created by danries on 2/10/17.
 */
public class SonOfLucifer extends RateControlRobot{
    /**
     * run: SonOfLucifer default behavior
     */
    public void run() {
        // Initialization of the robot should be put here

        setColors(Color.black,Color.DARK_GRAY,Color.red); // body,gun,radar

        turnRadarRightRadians(Double.POSITIVE_INFINITY);
        do {

        }while (true);
    }

    /**
     * onScannedRobot: What to do when you see another robot
     */
    public void onScannedRobot(ScannedRobotEvent e) {
        // Replace the next line with any behavior you would like
        double radarTurn = getHeadingRadians() + e.getBearingRadians() - getRadarHeadingRadians(); 
        fire(1);
    }

    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */
    public void onHitByBullet(HitByBulletEvent e) {
        // Replace the next line with any behavior you would like
        back(10);
    }

    /**
     * onHitWall: What to do when you hit a wall
     */
    public void onHitWall(HitWallEvent e) {
        // Replace the next line with any behavior you would like
        back(20);
    }
}
