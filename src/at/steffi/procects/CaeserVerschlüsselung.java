package at.steffi.procects;

public class CaeserVerschlüsselung {
    public static void main(String[] args) {
        String[] alphabet = {" ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g","h","i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s","t", "u", "v", "w", "x", "y", "z"};
        String word = "Spiel verloren";
        System.out.println("Start sentence: " + word);
        String encrypted_word = encrypt(word, alphabet, 2);
        System.out.println("Encrypted sentence: " + encrypted_word);
        String decrypted_word = decrypt(encrypted_word, alphabet, 2);
        System.out.println("Decrypted sentence: " + decrypted_word);
    }

    public static String encrypt(String string, String[] cipher, int offset){
        String[] string_list = string.split("");
        StringBuilder output = new StringBuilder();
        for (String character : string_list) {
            for (int j = 0; j < cipher.length; j++) {
                if (character.equals(cipher[j])) {
                    output.append(cipher[(j + offset) % cipher.length]);
                }
            }

        }
        return output.toString();
    }


    public static String decrypt(String string, String[] cipher, int offset){
        String[] string_list = string.split("");
        StringBuilder output = new StringBuilder();
        for (String character : string_list)
            for (int j = 0; j < cipher.length; j++) {
                if (character.equals(cipher[j])) {
                    int new_index = j - offset;
                    while (new_index < 0) {
                        new_index += cipher.length;
                    }
                    output.append(cipher[new_index]);
                }
            }
        return output.toString();
    }
}
