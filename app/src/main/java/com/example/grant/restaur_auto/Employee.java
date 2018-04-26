public class Employee
{
    public static int empID;
    public static String name;
    public static double payrate;
    public static String startdate;
    public static float hoursThisPeriod;
    public static float hoursThisYear;
    
    public Employee(int empID, String name, double payrate, String startdate, float hoursThisPeriod, float hoursThisYear)
    {
    	this.empID = empID;
    	this.name = name;
    	this.payrate = payrate;
    	this.startdate = startdate;
    	this.hoursThisPeriod = hoursThisPeriod;
    	this.hoursThisYear = hoursThisYear;
    }
}
