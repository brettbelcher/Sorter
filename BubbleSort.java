import java.util.ArrayList;

public class BubbleSort
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

        for(int i = 0 ; i < sortedList.size()-1 ; i++)
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
        }

        return sortedList;
    }
}