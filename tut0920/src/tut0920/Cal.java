package tut0920;

public class Cal {
	
	public int leng(int[] scores) {
		return scores.length;
	}
	
	public int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
	
	public double avg(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return (double) sum / scores.length;
	}
}
