import java.util.*;
import static java.lang.System.out;

public class BigNumber{
	public static void main (String[] args){
	
	//public the data
	String one;
	String two;
	ArrayList<Integer> sum = new ArrayList<>();;
	Scanner input = new Scanner(System.in);
	
	//input number
	System.out.println("Input two number : ");
	one = input.next();
    two = input.next();
	
	//input character into the string arraylist one by one
	String[] ArrayList1 = one.split("");
	String[] ArrayList2 = two.split("");
	
	//new three arraylists for calculate 
	ArrayList<Integer> arraylist1 = new ArrayList<>();
	ArrayList<Integer> arraylist2 = new ArrayList<>();
	ArrayList<Integer> arraylist3 = new ArrayList<>();
	
	//add string arraylist into int arraylist
	for(int i = 0;i< one.length();i++){
		arraylist1.add(Integer.valueOf(ArrayList1[i]));
	}
	for(int i = 0;i< two.length();i++){
		arraylist2.add(Integer.valueOf(ArrayList2[i]));
	}
	
	//calculate the number length and calculate
	if(one.length() == two.length()){
		for(int i =0;i < one.length();i++){
			arraylist3.add(arraylist1.get(i)+(arraylist2.get(i)));
		}
		for(int i =one.length()-1;i> 0;i--){
			if(arraylist3.get(i)>=10){
				arraylist3.set(i,(arraylist3.get(i)%10));
				arraylist3.set(i-1,arraylist3.get(i-1)+1);
			}
		}
		if(arraylist3.get(0)>= 10){
				arraylist3.set(0,arraylist3.get(0)%10);
				Collections.reverse(arraylist3);
				arraylist3.add(1);
				Collections.reverse(arraylist3);
		}
		
	}
	else{
		if(one.length()>two.length()){
			Collections.reverse(arraylist1);
			Collections.reverse(arraylist2);
			for(int g = 1;g <=one.length() - two.length();g++){
				arraylist2.add(0);
			}
			for(int t = 0;t <one.length();t++){
				arraylist3.add(arraylist1.get(t)+arraylist2.get(t));
			}
			for(int i =0;i< one.length()-1;i++){
			if(arraylist3.get(i)>=10){
				arraylist3.set(i+1,arraylist3.get(i+1)+1);
				arraylist3.set(i,(arraylist3.get(i)%10));
			}
		}
		if(arraylist3.get(one.length()-1)>= 10){
				arraylist3.set(one.length()-1,arraylist3.get(one.length()-1)%10);
				arraylist3.add(1);
		}
		Collections.reverse(arraylist3);
		}
		else{
			Collections.reverse(arraylist1);
			Collections.reverse(arraylist2);
			for(int g = 1;g <=two.length() - one.length();g++){
				arraylist1.add(0);
			}
			for(int t = 0;t <two.length();t++){
				arraylist3.add(arraylist1.get(t)+(arraylist2.get(t)));
			}
			for(int i =0;i< two.length()-1;i++){
			if(arraylist3.get(i)>=10){
				arraylist3.set(i+1,arraylist3.get(i+1)+1);
				arraylist3.set(i,(arraylist3.get(i)%10));
			}
		}
		if(arraylist3.get(two.length()-1)>= 10){
				arraylist3.set(two.length()-1,arraylist3.get(two.length()-1)%10);
				arraylist3.add(1);
		}
		Collections.reverse(arraylist3);
			
		}
	}
	
	//output arraylist3  add  ArrayList1.get()+ArrayList2.get();
	System.out.println("The number total is : "+arraylist3);

	}
}
