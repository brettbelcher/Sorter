import java.util.ArrayList;

public class BubbleSort implements Sorter
{
    private ArrayList<Integer> list= new ArrayList<Integer>();

    public BubbleSort(ArrayList<Integer> input)
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

        int i = sortedList.size();
        while(i > 0)
        {
            for(int j = 0 ; j < sortedList.size()-1 ; j++)
            {
                if(sortedList.get(j) > sortedList.get(j+1))
                {
                    int temp = sortedList.get(j);
                    sortedList.set(j, sortedList.get(j+1));
                    sortedList.set(j+1, temp);
                }
            }

            i--;
        }

        return sortedList;
    }
}