package ua.logos.lviv.cofe;

public class Main {

	public static void main(String[] args) {
    
		Robot robot = new Robot();
        
		CoffeRobot coffeRobot = new CoffeRobot();
        
		RobotCoocker robotCooсker = new RobotCoocker();
        
		RobotDancer robotDancer = new RobotDancer();

        
		robot.work();
        
		coffeRobot.work();
        
		robotCooсker.work();
        
		robotDancer.work();

        System.out.println("   ");

        Robot [] robots = {robot, robotCooсker, robotDancer, coffeRobot};

        for (int i = 0; i < robots.length; i++) {
            robots[i].work();
        }
    }
}
