import java.util.Arrays;

public class Assignment {
	
	public static String printType(String[] input, String type) {

		String result = "";
		for(int i=0;i<input.length;i++) {
			if(input[i].endsWith(type)) {
				result += input[i] + "-";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String[] files = {"song1.mp3", "hello.txt", "image.png" , "demo.jpg" , "system.txt" , "unit.mp3"};

		String[] types = {"mp3", "txt", "png", "jpg"};

		for(int i=0;i<types.length;i++) {
			String result = printType(files, types[i]);
			System.out.println(types[i]+" : "+Arrays.toString(result.split("-")));
		}
		

		
	}

}
