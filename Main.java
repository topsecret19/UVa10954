import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int test = sc.nextInt();
	while(true) {
		if(test==0) {
			break;
		}
		PriorityQueue<Integer> numbers = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				return i-j;
			}
		});
		PriorityQueue<Integer> additions = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				return i-j;
			}
		});
		for(int i=0; i<test; i++) {
			numbers.add(sc.nextInt());
		}
		while(numbers.size()!=1) {
			int a = numbers.poll();
			int b = numbers.poll();
			numbers.offer(a+b);
			additions.offer(a+b);
		}
		while(!additions.isEmpty()) {
			int a= additions.poll();
			int b = additions.poll();
			additions.add(a+b);
			if(additions.size()==1) {
				System.out.println(additions.poll());
			}
		}
		test=sc.nextInt();
	}
}
}
