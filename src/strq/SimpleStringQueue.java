package strq;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by c4q-sarahkim on 12/10/15.
 */
public class SimpleStringQueue implements StringQueue
{

    ArrayDeque characterQueue;

    public SimpleStringQueue()
    {
        this.characterQueue = new ArrayList<Character>();
    }

    @Override
    public int length()
    {
        return characterQueue.size();
    }

    @Override
    public void enqueue(String string)
    {
        for (int i = 0; i < string.length(); i++) {
            characterQueue.add(string.charAt(i));
        }
    }

    @Override
    public String dequeue(int length)
    {
        if (length > characterQueue.size())
            throw new RuntimeException("The queue doesn't contain enough characters to satisfy the request.");

        String dequeueString = "";
        for (int i = 0; i < length; i++) {
            dequeueString += characterQueue.get(i);
            characterQueue.remove(i);
        }
        return dequeueString;
    }
}
