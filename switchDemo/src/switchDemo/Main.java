package switchDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char grade = 'C';
		
		switch(grade) {
		case 'A':
			System.out.println("Süper : Geçtiniz");
			break;
		case 'B':
			
		case 'C':
			System.out.println("Fena değil : Geçtiniz");
			break;	
		case 'D':
			System.out.println("Kaldınız");
			break;
			default:
				System.out.println("Geçersiz not girdiniz");
		
		
		}

	}

}
