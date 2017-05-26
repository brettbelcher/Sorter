import java.util.ArrayList;

public class SelectionSort implements Sorter
{
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public SelectionSort(ArrayList<Integer> input)
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

        int i = sortedList.size()-1;
        int max = 0;
        int maxIndex = -1;
        while(i > 0)
        {
            max = 0;
            for(int j = 0 ; j < i ; j++)
            {
                if(sortedList.get(j) > max)
                {
                    max = sortedList.get(j);
                    maxIndex = j;
                }
            }
            int temp = sortedList.get(i);
            sortedList.set(i, max);
            sortedList.set(maxIndex, temp);
            i--;
        }

        return sortedList;
    }
}