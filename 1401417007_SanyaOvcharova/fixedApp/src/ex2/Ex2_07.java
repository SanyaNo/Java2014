package ex2;

public class Ex2_07 {

	public static String[] menu;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		menu = new String[6];
		menu[1] = "������� �� ����";
		menu[2] = "������� �� ���";
		menu[3] = "�������� �� ���������";
		menu[4] = "���������";
		menu[5] = "�����";
		
		drawMenu(menu);
		
		
		
	

	}

	public static void drawMenu(String[] menu) {
		
		
		for (int i = 1; i < menu.length; i++) {

			System.out.println(i + ". " + menu[i]);

		}

		while (true) {
			System.out.println("�������� ����� �� ����!");
			int input = Ex2_05.listener.nextInt();
			
			if (numEval(input)) {
				System.out.println("�������� " + menu[input]);

			} else {
				System.out.println("��������� �������������");

			}
			
			if(input == 5){
				System.out.println("��������� �� ���������!");
				break;
			}
		}

		

	

	}

	
	public static boolean numEval(int input) {
		if (input > 0 && input <= 5)
			return true;
		else
			return false;

	}

}
