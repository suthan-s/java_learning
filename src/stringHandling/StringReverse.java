package stringHandling;

public class StringReverse {
    public String reverseString(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public String reverseString2(String s) {
        byte[] s1 = s.getBytes();
        System.out.println(s1);
        byte[] s2 = new byte[s1.length];
        System.out.println(s2);
        for (int i=0; i<s1.length; i++){
            s2[i] = s1[s1.length-i-1];
        }
        return new String(s2);
    }
    public static void main(String[] args) {
        String s1 ="suthan";
        StringReverse sr = new StringReverse();
        System.out.println(sr.reverseString(s1));
        System.out.println(sr.reverseString2(s1));
    }
}
