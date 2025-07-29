package Review_Day1;

public class Arr {
	public static void main(String[] args) {
		String subjectArr[]= {"java","oracle","html","javascript","jsp"};
		int scoreArr[]= {90,85,60,95,100};
		int sum=0;
		int count =0;
		for(int i = 0; i<subjectArr.length;i++) {
			System.out.print("과목명 : " + subjectArr[i]+",");
			System.out.println(" 점수 : " + scoreArr[i]);
			sum += scoreArr[i];			
		}
		
		//점수가 평균을 넘는 과목들을 출력
		//결과 : "평균이 넘는 과목은 java, javascript,jsp" 입니다
		int avg=sum/scoreArr.length;
		for(int i = 0; i<subjectArr.length;i++) {
			if(scoreArr[i]> avg) {
				
			}
		}
	}
}
