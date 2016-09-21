import java.util.*;
public class LoopTwo
{
    private int[] nums;
    
    public LoopTwo(int n)
    {
       nums = new int[n];
    }
    public void loadRandom(int min, int max)
    {
        for(int i = 0; i < nums.length; i++)
        {
            int result = (int)(Math.random() * max) + min;
            nums[i] = result;
        }
    }
    public void printArray()
    {
        for(int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + "\t");
        }
        System.out.print("\n");
    }
    public void sortArray()
    {
        for(int i = 0; i < nums.length; i++)
        {
            Arrays.sort(nums);
        }
    }
    public double findAverage()
    {
        double sum = 0;
        double mean = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
        }
        mean = sum / nums.length;
        return mean;
    }
}
