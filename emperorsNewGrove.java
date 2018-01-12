import java.util.ArrayList;
public class emperorsNewGrove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> emperorCast = new ArrayList <String>();
		emperorCast.add("Kuzco");
		emperorCast.add("Pacha");
		emperorCast.add("Yzma");
		emperorCast.add("Kronk");
		
		emperorCast.set(1, "Yzma");
		emperorCast.set(2, "Chaca");
		emperorCast.add(3, "Tipo");
		emperorCast.add(5, "Bucky");
		emperorCast.add(6, "Pacha");
		System.out.println(emperorCast);

		
	}

}
