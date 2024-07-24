import java.util.random.*;
public class Toss
{
    public static void main(String[] args) {

        int noOfToss = 5;
        double head = 0;
        double tails = 0;
        double headPer=0;
        double tailPer=0;

        for(int i=0;i<noOfToss;i++)
        {
            double toss = Math.random();
            System.out.println(toss);
            if(toss<0.5)
            {
                head++;
            }
            else
            {
                tails++;
            }
        }

        System.out.println(head);
        System.out.println(tails);

        headPer = (head/noOfToss)*100;
        tailPer = (tails/noOfToss)*100;
        System.out.println("Head % ="+ headPer);
        System.out.println("Tail % ="+ tailPer);
    }
}
