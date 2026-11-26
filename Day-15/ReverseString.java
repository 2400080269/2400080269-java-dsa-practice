public class ReverseString {
    public static void main(String[] args) {
        String text = "Java";
        StringBuilder reversed = new StringBuilder(text).reverse();
        System.out.println(reversed);
    }
}
