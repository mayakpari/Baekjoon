import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				break;
			}
			
			List<String> list = new ArrayList<>();
			
			for(int i=0;i<num;i++) {
				list.add(br.readLine());
			}
			
			Collections.sort(list, new Comparator<String>() {
				
				@Override
				public int compare(String o1, String o2) {
					return o1.toLowerCase().compareTo(o2.toLowerCase());
				}
			});
            
            System.out.println(list.get(0));
		}
        
	}

}
