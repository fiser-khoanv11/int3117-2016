package chinhvm;

public class FindSpecialYear {
	int y1;
	int y2;

	public FindSpecialYear(int year1, int year2) {
		// TODO Auto-generated constructor stub		
		this.y1 = year1;
		this.y2 = year2;
	}
	
	public int findYear() {
		int count = 0;
		
		for(int i = y1; i <= y2; i++) {
			if((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0)) {
				count++;
			}
			
			if(i % 12 == 3) {
				count++;
			}
		}
		
		return count;
	}
}
