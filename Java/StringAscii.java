import java.util.*;

public class StringAscii {
	String str = "";

	public static void main(String[] args) {

		StringAscii assii = new StringAscii();
		assii.AddString('a');
		assii.AddString('2');
		assii.AddString('c');
		assii.AddString('1');
		assii.AddString('e');
	}

	public void AddString(char jaGharihar) {

		char character = jaGharihar;
		int ascii = character;
		if (ascii >= 48 && ascii <= 57) {
			str = str + character;
			System.out.println(str);
		}

	}
}