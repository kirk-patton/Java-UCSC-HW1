
public class Perimeter {

	public static void main(String[] args) {
		float width  = 4.5f;
		float height = 7.9f;
		
		float perimeter = 2*(width + height);
		float area = width * height;
		
		System.out.printf("The area is %.2f\n",area);
		System.out.printf("The perimeter is %.2f\n",perimeter);
	}
}