package test;

public class test230906_1312 {
	public static void main(String[] args) {
		int[] a = {};
		int n = 0;
		int key = 0;
		binSearch(a, n, key);
	}
	
	static int binSearch(int[] a, int n ,int key) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl + pr) / 2;
			if(a[pc] == key) {
				return pc;
			}else if(a[pc] < key) {
				pl = pc+1;
			}else {
				pl = pc-1;
			}
				
		}while(pl<=pr);
		
		return -1;
	}
}

