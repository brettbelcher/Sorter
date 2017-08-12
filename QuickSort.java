import java.util.ArrayList;

public class QuickSort implements Sorter
{
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public QuickSort(ArrayList<Integer> input)
    {
        list = input;
    }

    public ArrayList<Integer> getSortedList()
    {
        ArrayList<Integer> output = new ArrayList<Integer>();
        output = sort(list);
        return output;
    }

    public ArrayList<Integer> sort(ArrayList<Integer> unsortedList)
    {
        return quickSort(unsortedList, 0, unsortedList.size()-1);
    }

    public ArrayList<Integer> quickSort(ArrayList<Integer> unsortedList, int lo, int hi)
    {
        //Pointers
        int i = lo;
        int j = hi;
        int pivot = unsortedList.get(lo + (hi-lo)/2);

        //Only go until pointers cross
        while(i <= j)
        {
            //Find something that shouldn't be on the left side of the list
            while(unsortedList.get(i) < pivot)
            {
                i++;
            }
            //Find something that shouldn't be on the right side of the list
            while(unsortedList.get(j) > pivot)
            {
                j--;
            }
            //Swap them, then continue the search if the pointers haven't crossed
            if(i <= j)
            {
                int temp = unsortedList.get(i);
                unsortedList.set(i, unsortedList.get(j));
                unsortedList.set(j, temp);
                i++;
                j--;
            }
        }

        //Recursively sort, but don't bother when lo == j or when i == hi because the base cases
        //Should just return the same list
        if(lo < j)
            quickSort(unsortedList, lo, j);
        if(i < hi)
            quickSort(unsortedList, i, hi);

        return unsortedList;
    }
}