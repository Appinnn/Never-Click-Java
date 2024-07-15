package java0715_2;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) 
	{
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(34); tree.add(45); tree.add(20); tree.add(9); tree.add(40); tree.add(15);
		tree.add(48); tree.add(2); tree.add(11); tree.add(39); tree.add(40);
		
		System.out.println( tree );
		System.out.println( tree.first() );
		System.out.println( tree.last() );
		
		//입력값 보다 큰 수 중에서 가장 가까운 값 검색
		System.out.println( tree.higher(25) );
		//입력값 보다 작은 수 중에서 가장 가까운 값 검색
		System.out.println( tree.lower(19) );
		
		//입력값보다 작은 모든 값 검색
		System.out.println( tree.headSet(35) );
		//입력값보다 큰 모든 값 검색
		System.out.println( tree.tailSet(30) );
		
		//입력값들의 사이에 있는 값을 검색
		System.out.println( tree.subSet(9, 39) );
		
		
		TreeSet<String> word = new TreeSet<>();
		word.add("이순신"); word.add("문익점"); word.add("장보고"); word.add("김유신"); word.add("정도전"); word.add("박팽년");
		word.add("성상문"); word.add("마골피"); word.add("나훈아");
		
		System.out.println( word );
		
		System.out.println( word.higher("아") );
		System.out.println( word.headSet("라면") );
		System.out.println( word.subSet("나", "자") );

		System.out.println( word.subSet("ㄴ", "ㅇ") );
		
		// 90점이상 - 상위10%, 70점이상 - 상위30%, 40점이상 - 상위80%
		
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Integer> rank = new TreeSet<>();
		rank.add(90); rank.add(70); rank.add(40);
		
		//나의 점수를 입력하여 상위 몇프로 인지 출력
		
		System.out.println("내 점수에 맞는 랭크는? : ");
		
		int result = sc.nextInt();
		rank.add(result);
//		System.out.println("90점이상 - 상위10%, 70점이상 - 상위30%, 40점이상 - 상위80%");
		
		if(result > rank.lower(90))
		{
			System.out.println("상위10%");
		}
		else if(result > rank.lower(70))
		{
			System.out.println("상위30%");
		}
		else 
		{
			System.out.println("상위80%");
		}
		
		TreeSet<String> score = new TreeSet<>();
		score.add("89점 이순신"); score.add("67점 김유신"); score.add("45점 문익점"); score.add("98점 한석봉"); 
		score.add("72점 박문수"); score.add("81점 김춘추"); score.add("59점 이성계"); score.add("32점 정약용"); 
		
		// 내 점수를 입력하고 나보다 점수가 높은 사람들 출력
		
		
		String myscore = "80";
		System.out.println(score.tailSet(myscore));
		
		
		
		
	}

}


/*
 	Tree 구조를 이용하여 값을 저장시키는 TreeSet
 	- 순차적으로 데이터를 저장하지 않는다.
 	- 중복저장을 허용하지 않음
 	- 이진트리를 사용하기 때문에 데이터가 정렬되어 출력된다.
 	- 범위 검색 또는 데이터 중복방지 및 정렬에 용이 하다.
  
  
  
  
  
  
  
 */
