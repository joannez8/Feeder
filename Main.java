public class Main
{
    public static void main(String[] args)
    {
        //simulateOneDay test cases
        Feeder f = new Feeder(500); //ex#1
        f.simulateOneDay(12);
        System.out.println(f.getCurrentFood());
        f = new Feeder(1000); //ex#2
        f.simulateOneDay(22);
        System.out.println(f.getCurrentFood());
        f = new Feeder(100); //ex#3
        f.simulateOneDay(5);
        System.out.println(f.getCurrentFood());

        //simulateManyDays test cases
        f = new Feeder(2400); //ex#1
        System.out.println(f.simulateManyDays(10,4));
        f = new Feeder(250); //ex#2
        System.out.println(f.simulateManyDays(10,5));
        f = new Feeder(0); //ex#3
        System.out.println(f.simulateManyDays(5,10));
    }
}