package interviewQuestions;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "^*cat&";
		String b = "^act*";
		
		int al[] = new int[256];
		int bl[] = new int[256];
		
		boolean isAnagram = true;
		
		for (char c: a.toCharArray()) {
			int index = (int) c;
			al[index]++;
			}
				

		for (char c: b.toCharArray()) {
			int index = (int) c;
			bl[index]++;
			}
		
		for(int i=0; i<256; i++) {
			
			if(al[i] != bl[i]) {
				isAnagram = false;
				break;
			}
		}
		
			if(isAnagram) System.out.println("Anagram");
			else System.out.println("not an Anagram");
	
	}

}
