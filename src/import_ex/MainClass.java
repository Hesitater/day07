package import_ex;

//패키지 선언부 아래, 클래스 상단부에 import선언으로 패키지명을 포함한 사용할 클래스를 지정합니다.
//import fruit.Apple;
//import fruit.Melon;
import fruit.*;

import java.util.Scanner;

import com.abc.ABC;
import com.def.DEF;

public class MainClass {

	public static void main(String[] args) {
		
		Apple a = new Apple();
		Melon m = new Melon();
		
		ABC abc = new ABC();
		DEF def = new DEF(); //ctrl + space  
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(a);
		System.out.println(m);
		System.out.println(abc);
		System.out.println(def);
		System.out.println(scan);
		
		
	}
}
