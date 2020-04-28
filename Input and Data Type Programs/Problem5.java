import java.util;
public class P2_5{
	public static void main(String[] args){
		Random a = new Random();
		int r = a.nextInt(48) + 1;
    int s = a.nextInt(48) + 1;
    int t = a.nextInt(48) + 1;
    int u = a.nextInt(48) + 1;
    int v = a.nextInt(48) + 1;
    int w = a.nextInt(48) + 1;
    System.out.println(“Play this combination—it’ll make you rich!”)
	System.out.println(r + “ “ + s + “ “ + t + “ “ + u + “ “ + v + “ “ + w);
}
