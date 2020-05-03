package stringProcessing;
//CeasarCipher
public class Add3Letters {
    public static void main(String[] args) {
        System.out.println(add3("JavaIsFun"));
        doCeaserCipher("abcdexyz");
  doThatWayCeasarCipher("abcxyz");
        }

    public static StringBuilder add3(String a){
        StringBuilder str=new StringBuilder(a);
        for(int i=0; i<str.length(); i++){
            str.setCharAt(i,(char)(str.codePointAt(i)+3));
        }
        return str;
    }
    public static void doCeaserCipher(String word){
        char ch;
        for(int i=0; i<word.length(); i++){
            ch=word.charAt(i);
            ch=(char)((ch-'a'+3)%26+'a');
            System.out.print(ch);
        }
    }
    public static void  doThatWayCeasarCipher(String word) {
        String original = "abcdefghijklmnopqrstuvwxyz";
        String ciphered = "defghijklmnopqrstuvwxyzabc";
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            index = original.indexOf(word.charAt(i));
            System.out.print(ciphered.charAt(index));
        }
    }
    /*Umedi
        public static String cipher(String str, int cipher){
        Hashtable<Character,Character> ht=new Hashtable<>();
        int x=(int)'a';
        String result="";
        for (char i='a';i<='z';i++){
            if (i+cipher<='z') {
                ht.put(i, (char) (i + cipher));
            }
            else {
                ht.put(i, (char) (x + cipher-(123-i)));
                x++;
            }
        }
        for (int i=0;i<str.length();i++){
            result+=ht.get(str.charAt(i));
        }
        return result;

     */
}
