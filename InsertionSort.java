import java.util.ArrayList;

public class InsertionSort implements Sorter
{
    private ArrayList<Integer> list = new ArrayList<Integer>();
    public InsertionSort(ArrayList<Integer> input)
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
        ArrayList<Integer> sortedList = new ArrayList<Integer>();
        sortedList = unsortedList;

        for(int i = 1 ; i < sortedList.size() ; i++)
        {
            int cur = sortedList.get(i);
            int j = i-1;
            while(j >= 0 && sortedList.get(j) > cur)
            {
                sortedList.set(j+1, sortedList.get(j));
                j--;
            }
            sortedList.set(j+1, cur);
        }

        return sortedList;
    }
}