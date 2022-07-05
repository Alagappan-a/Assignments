import java.util.Scanner;
import java.util.ArrayList;


public class Flames {

	public static void findRelatioship(String player1, String player2) {
		char temp = 0, temp1 = 0;
		int count=0 , count1 = 0;
		char p1[] = player1.toCharArray();
		char p2[] = player2.toCharArray();
		for (int i = 0; i < p1.length; i++) {
			temp = p1[i];
			for (int j = 0; j < p2.length; j++) {
				temp1 = p2[j];
				if (temp == temp1) {
					p1[i] = 0;
					p2[j] = 0;	
					break;
				}
			}
		}
		
		for (int i = 0; i < p1.length; i++)
			if (p1[i] != 0) {
				count++;
				}
		for (int i = 0; i < p2.length; i++)
			if (p2[i] != 0) {
				count1++;
			}
		int finalCount=count+count1;
		System.out.println(finalCount);
		String flames = "flames";
        StringBuilder sb3 = new StringBuilder(flames);
        
        char flameResult = 0;
        
        while(sb3.length()!=1)
        {
            int y = finalCount%sb3.length(); 
            String temp2;
            
            if(y!=0)
            {
                temp2 = sb3.substring(y)+sb3.substring(0, y-1); 
                System.out.println(temp2);
            }
            else
            {
                temp2 = sb3.substring(0, sb3.length()-1); 
                System.out.println(temp2);
                
            }
            sb3 = new StringBuilder(temp2);
            flameResult = sb3.charAt(0);
            
        }
        System.out.println(flameResult);
	}
		/*char[] flames = "FLAMES".toCharArray();
		int outerLoopMax = flames.length - 1;
		int flamesIndex = 0;
		for (int i = 0; i <= outerLoopMax; i++) {
			for (int j = 0; j < finalCount-1; j++) {
				flamesIndex++;
				if(flamesIndex==flames.length-i) {
					flamesIndex=0;	
					System.out.println("done");
				}
				
				while(i > 0 && flames[flamesIndex++] != ':') {
					if(flamesIndex==flames.length) {
						flamesIndex=0;
						System.out.println("done1");
					}
				}
			}
			// remove character at flamesindex
			System.out.println("Removing Character at index " + flamesIndex + ", and character is " + flames[flamesIndex]);
			flames[flamesIndex] = ':';
//			System.out.println(flames);
		}
		System.out.println(flames);
	}*/

	public static void main(String argd[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player1");
		String player1 = sc.nextLine();
		System.out.println("Enter the player2");
		String player2 = sc.nextLine();
		findRelatioship(player1, player2);
	}
}
