
import java.util.*;

public class NumberLetterCount {
	
	
	static HashMap hm = new HashMap();
	
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		
		//String letters[] = {"one","two","three","four","five",""}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int i,j=0,k;
		
		System.out.println("Enter the values in alphabets from 1 to 20");
		
		int nums[] = {30,30,50,60,70,80,90,100,1000};
		
		for(i=1;i<=29;i++){
			if(i<=20)
			hm.put(i, obj.nextLine());
			else{
			while(j<9){	
			hm.put(nums[j], obj.nextLine());
			j++;
			}
			}
		}
		
	//	System.out.println("THe calues are -> ");
		
	
		//	System.out.println(hm.get(1));
		
		//System.out.println("Enter the nu of elements");
		
		//int n = obj.nextInt();
			
		//System.out.println("Enter the numbers you want to get count for");	
			
		for(i=1;i<=1000;i++){
			al.add(i);
		}
		
		
		
		int num = getCount(al);
		
		System.out.println("Count of gven numerbs is "+num);
	}
	//end of main 
	
	
	public static int getCount(ArrayList<Integer> al){
		
		String s="",s1="",s2="";
		int count = 0;
		int lsb,middlesb,msb,copynum;
		
		for(int l=0;l<al.size();l++){
			int mynum = al.get(l);
			//System.out.println(mynum);
		
			
			if(mynum<20){
			
				//for numbers 1 to 20
				
			s += hm.get(mynum);
			System.out.println(hm.get(20));;
			}
			else if(mynum>=20 && mynum<100){
				//for numbers 21 to 100
				
				if(mynum%10 == 0){
					
					s += hm.get(mynum);
						
					
				}
				else{	
				
				copynum = mynum;
				msb = mynum%10;
				mynum = mynum / 10;
				lsb = mynum % 10;
				
				lsb = lsb*10;
				
				s += hm.get(msb);
				s += hm.get(lsb);
				}
				
				//System.out.println(s);
			}
			else {
				//100 on
				
				//if(mynum==100 || mynum == 1000){
				if(mynum%100 == 0){
					
					System.out.println(s);
					
					if(mynum == 1000){
						System.out.println("ssss");
						s +=hm.get(mynum);
						System.out.println("adasds");
						//System.out.println(s);
					
					}
					
					msb = mynum%10;
					mynum = mynum / 10;
					
					
					middlesb = mynum%10;
					mynum = mynum/10;
					lsb = mynum % 10;
					//System.out.println("lsb -> "+lsb);
					
					s+=hm.get(lsb);
					s+="hundred";
				//	System.out.println(s);
				
				}
				else if(mynum%100>0 && mynum%100<20){
					//for numbers from 101 to 120 201 to 220....
					copynum = mynum;
					msb = mynum%100;
					//System.out.println("msb -> "+msb);
					mynum = mynum / 10;
					
					
					middlesb = mynum%10;
					mynum = mynum/10;
					lsb = mynum % 10;
					
					middlesb = middlesb*10;
					
					s += hm.get(lsb)+"hundredand";
					//s += hm.get(middlesb);
					s += hm.get(msb);
						
					//System.out.println(s);
					
					
				}
				else{
					
					
					
					
					msb = mynum%10;
				//	System.out.println("msb -> "+msb);
					mynum = mynum / 10;
					
					
					middlesb = mynum%10;
					mynum = mynum/10;
					lsb = mynum % 10;
					
					middlesb = middlesb*10;
					
					s += hm.get(lsb)+"hundredand";
					s += hm.get(middlesb);
					s += hm.get(msb);
						
					System.out.println(s);
					break;
					
				}
				
				
			}
			
			
		}
		
		count = s.length();
		
		return count;
	}

}
