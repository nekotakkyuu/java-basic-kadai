package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean[] num = new boolean[101];
		
		for( int i = 1 ; i < num.length ; i++ ) {
			num[i]  = true;
		}
		
		int j = 2;
		while( j < num.length  ) {
				for( int i = j + 1 ; i < num.length ; i++ ) {
					if( i % j == 0 ) {
						num[i] = false;
						continue;
					}
				}
				j++;
			}
		
		for( int i = 2; i < num.length ; i++ ) {
			if( num[i] ) {
				System.out.println(i);
			}
			
		}
	
	}

}
