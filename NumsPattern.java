/*	Program to create the pattern:
	1	1	1	1	1
	2	2	2	2
	3	3	3	
	4	4	
	5
*/

class NumsPattern{
	public static void main(String[] args){
		int num=1;
		for(int i=5; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print(num+ "	");
			}
			System.out.println("");
			num++;
		}
	}
	
}