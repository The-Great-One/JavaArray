public class CharCount {
    public static void main(String[] args) {
        String string = "Bajaj Finserv";
        int count = 0;

        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ')
                count++;
        }

        System.out.println("Count: " + count);
    }
}
