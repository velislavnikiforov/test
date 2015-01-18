import java.util.Scanner;
public class CountBeers {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int totalBeers = 0;
	int beers = 0;
	
	while(true){
		String line = input.nextLine();
		if(line.equals("End")){
			break;
		}
		String[] order = line.split(" ");
		if(order[1].equals("stacks")){
			beers += (Integer.parseInt(order[0]) * 20);
		}
		else{
			beers += Integer.parseInt(order[0]);
		}

	}
	System.out.printf("%d stacks + %d beers", beers/20, beers % 20);

}
}
