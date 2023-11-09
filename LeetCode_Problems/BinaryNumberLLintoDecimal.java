public class BinaryNumberLLintoDecimal {


    int BinarytoDecimal(Node head)
    {
       
        Node temp = head;
        int results = 0;
        while(temp != null)
        {
            results =  results * 2 + temp.data;
            temp = temp.next;
        }

        return results ;

    }
}
