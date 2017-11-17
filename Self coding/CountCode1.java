
public class CountCode1 {

	public static void main(String[] args) {
		
		String st = "aaacodebbb";
		int count = 0;
		
		for(int i=0; i<st.length()-3 ; i++){
			
			if("co".compareTo(st.substring(i, i+2))==0 && "e".compareTo(st.substring(i+3,i+4)) == 0){
				count++;
			}
		}
		
		System.out.println(count);
		}
}
