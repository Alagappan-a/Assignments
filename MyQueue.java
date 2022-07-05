package Zsgs.Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MyQueue {
	 static int totalCount=0;
	    static int queueCapacity=0;
	    static int currentUserInQueue=0;
	    int maxHallCount=0;
	    Queue<Integer> ll = new LinkedList<Integer>();
	    int startingCount =0;
	    public static void main(String[] args)
	    {
	        MyQueue c = new MyQueue();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the total number of candidates who appeared for the interview: ");
	        totalCount = sc.nextInt();
	        c.maxHallCount=totalCount;
	        System.out.println("Enter the capacity a queue can handle at a time : ");
	        queueCapacity= sc.nextInt();
	        while(totalCount > 0)
	        {
	            c.allowInterviewersWhenQueueIsAvailable();
	            System.out.println("INTERVIEWER ID : "+ c.ll.poll() +" has completed the interview");
	            if(totalCount==0)
	            {
	                while(c.ll.size() >0)
	                {
	                    System.out.println("INTERVIEWER ID : "+ c.ll.poll() +" has completed the interview");
	                    if(c.ll.size() != 0)
	                    {
	                        System.out.println("CANDIDATES WAITING IN THE QUEUE :");
	                        System.out.println(c.ll + "\n");
	                    }
	                }
	                System.out.println("Interview process completed successfully..NO MORE PERSON TO INTERVIEW");
	            }
	        }
	    }
	    public void allowInterviewersWhenQueueIsAvailable()
	    {
	        if(ll.size()<MyQueue.queueCapacity)
	        {
	            int j = MyQueue.currentUserInQueue;
	            int loopCount= MyQueue.queueCapacity-ll.size();
	            for(int i=0;i<loopCount;i++)
	            {
	                if(j+1 <= maxHallCount)
	                {
	                    ll.add(++j);
	                }
	                else
	                {
	                    break;
	                }
	            }
	            System.out.println("CANDIDATES  WAITING IN THE QUEUE :");
	            System.out.println(ll+"\n");
	            MyQueue.currentUserInQueue=j;
	            totalCount -= loopCount;
	        }
	    }


}
