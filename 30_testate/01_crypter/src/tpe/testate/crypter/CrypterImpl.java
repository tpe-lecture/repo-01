package tpe.testate.crypter;

/**
 * Class to encrypt and decrypt a String
 * @author Christian Coenen
 *
 */
public class CrypterImpl implements Crypter {

	String valid = "abcdefghijklmnopqrstuvwxyz123456789 ";

	@Override
	/**
	 * Method who encrypts a String.
	 */
	public String encrypt(String input) {
		input = input.toLowerCase();
		String encr ="";
		for(int i = 0; i < valid.length(); i++) {
			if(input.charAt(i) == valid.charAt(i)) {
				switch(input.charAt(i)) {
					case 101: encr += "3"; break; // e to 3
					case  51: encr += "e"; break; // 3 to e
					case 108: encr += "1"; break; // l to 1
					case  49: encr += "l"; break; // 1 to l
					case 111: encr += "0"; break; // o to 0
					case  48: encr += "o"; break; // 0 to o
					case  97: encr += "4"; break; // a to 4
					case  52: encr += "a"; break; // 4 to a
					case 116: encr += "7"; break; // t to 7
					case  55: encr += "t"; break; // 7 to t
				}
			}
		}
		return encr;
	}

	@Override
	/**
	 * Method who decrypts a String.
	 */
	public String decrypt(String input) throws IllegalArgumentException {
		input = input.toLowerCase();
		String decr ="";
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == valid.charAt(i)) {
				switch(input.charAt(i)) {
					case 101: decr += "3"; break; // e to 3
					case  51: decr += "e"; break; // 3 to e
					case 108: decr += "1"; break; // l to 1
					case  49: decr += "l"; break; // 1 to l
					case 111: decr += "0"; break; // o to 0
					case  48: decr += "o"; break; // 0 to o
					case  97: decr += "4"; break; // a to 4
					case  52: decr += "a"; break; // 4 to a
					case 116: decr += "7"; break; // t to 7
					case  55: decr += "t"; break; // 7 to t
				}
			}
			else{
				throw new IllegalArgumentException("Ungültiges Zeichen!");
			}
		}
		return decr;
	}
}
