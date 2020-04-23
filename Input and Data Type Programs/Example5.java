public class E2.5 {
  public static void main (String[] args) {
    String s = “Mississippi”;
    for (int i=0; i<s.length(); i++) {
      if (s[i] == ‘s’) {
        s[i] = ‘$’;
      }
      else if (s[i] == ‘i’) {
        s[i] = ‘!’;
      }
    }
    System.out.println(s);
  }
}
