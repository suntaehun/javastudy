package chapter01;

public class Ex17Switch {
	public static void main(String[] args) {
		char grade = 'C';
		
		switch(grade) {
		case 'A':
		case 'B': {
			System.out.println("참 잘 했어요.");
			break;
		}
		case 'C':
		case 'D': {
			System.out.println("좀 더 노력하세요.");
			break;
		}
		case 'F': {
			System.out.println("재수강 하세요.");
			break;
		}
		default: {
			System.out.println("잘못된 학점입니다.");
			break;
		}
		
		}

	}

}
