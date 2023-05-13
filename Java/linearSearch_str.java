public class linearSearch_str {
    public static void main(String[] args) {
        String name = "Aman";
        char Target = 'p';
        System.out.println(Search(name, Target));
    }
    static boolean Search(String namefun, char check) {
        if (namefun.length() == 0) {
            return false;
        }

        for(int c : namefun.toCharArray()) {
            if (c == check) {
                return true;
            }
        }
//this code  for (int i = 0; i < namefun.length(); i++) {
// while be  if (check == namefun.charAt(i)) {
// the same  return true;
//          }

        return false;
    }
}
