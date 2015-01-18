import java.util.Scanner;
public class VideoDurations {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int min = 0;
	int hrs = 0;
	while(true){
		String line = input.nextLine();
		if(line.equals("End")){
			break;
		}
		String[] time = line.split(":");
		hrs += Integer.parseInt(time[0]);
		min += Integer.parseInt(time[1]);
		
		
	}
	hrs += min / 60;
	min = min % 60;
	if(min <= 9){
		System.out.printf("%d:0%d", hrs, min);
	}
	else{
		System.out.printf("%d:%d", hrs, min);
	}
	
}
}
