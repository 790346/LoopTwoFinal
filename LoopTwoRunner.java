public class LoopTwoRunner
{
    public static void main(String[] args)
    {
        int n = 7;
        LoopTwo loop = new LoopTwo(n);
        System.out.print("\f");
        loop.loadRandom(1, 2);
        loop.printArray();
        loop.sortArray();
        loop.findAverage();
        loop.printArray();
        System.out.println("The Average is: " + loop.findAverage() + "!");
        
        
    }
}
