import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		List<pool> list = new ArrayList<>();
		for(int i=0;i<N;i++) {
			list.add(new pool(sc.nextInt(),sc.nextInt()));
		}
		Collections.sort(list);
		int boardCnt = 0; // 널판지 개수
		int endLocate = 0;// 널판지를 놓을 위치
		for(int i=0;i<N;i++){
			pool p = list.get(i);
			// 웅덩이 위치와 널판지 놓을 위치 비교
			
			// 웅덩이 시작위치가 널판지 놓을위치보다 오른쪽에 있으면 
			if(p.start > endLocate){
				// 널판지 놓을위치 변경
				endLocate = p.start;
			}
			
			// 널판지를 놓을 위치가 웅덩이 상에 있으면
			if(p.end >= endLocate){
				while(true){
					// 널판지 마지막위치가 웅덩이를 벗어나면(현재 웅덩이를 다 덮으면)
					if(p.end <= endLocate)
						//종료
						break;
					// 널판지를 덮고 널판지를 놓을 위치 변경
					endLocate += L;
					boardCnt++;
				}
			}
		}
		System.out.println(boardCnt);
	}

}

class pool implements Comparable<pool>{
	int start;
	int end;
	pool(int start,int end){
		this.start = start;
		this.end = end;
	}
	//웅덩이 시작위치를 기준으로 정렬
	@Override
	public int compareTo(pool p) {
		if(this.start > p.start) {
			return 1;
		}else if(this.start < p.start) {
			return -1;
		}else
			return 0;
	}
}