
import java.util.LinkedList;

public class MergeTwoLL {

void    LinkedList  mergeLists(LinkedList first , LinkedList second)
    {
             Node f = list1.head;
             Node s = list2.head;

            LinkedList ansList = new LinkedList();
             
            while (f != null && s != null)
            {
                if(f.val <  s.val)
                {
                    ansList.insertLast(f.val);
                    f = f.next;
                }
                else{
                    ansList.insertLast(s.val);
                    s = s.next;
                }

            }

            while(f != null)
            {
                    ansList.insertLast(f.val);
                    f = f.next;
                
            }
                while(s != null)
            {
                    ansList.insertLast(s.val);
                    s = s.next;
                
            }
            return ansList;
    }

}
