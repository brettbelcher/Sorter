import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SorterMain
{
    public static void main(String[] args)
    {
        ArrayList<Integer> input = readInput(args[0]);

        System.out.println(input);

        QuickSort quickSort = new QuickSort(input);
        input = quickSort.getSortedList();
        
        System.out.println(input);
    }

    public static ArrayList<Integer> readInput(String filename)
    {
        ArrayList<Integer> input = new ArrayList<Integer>();
        try
        {
            Scanner in = new Scanner(new File(filename));
            while(in.hasNextInt())
            {
                input.add(in.nextInt());
            }
        }
        catch(FileNotFoundException e)
        {}

        return input;
    }
}