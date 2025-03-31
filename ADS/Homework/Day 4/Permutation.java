// class Permutation{
	// static void display(String str,String res){
		// if(str.length()==0){
			// System.out.println(res+"");
			// return;
		// }
		// for(int i=0;i<str.length();i++){
			// char ch=str.charAt(i);
			// String ros=str.substring(0,i)+str.substring(i+1);
			// display(ros,res+ch);
		// }
	// }
	// public static void main(String args[]) {
		// String a="ABCD";
		// display(a,"");
	// }
// }

import java.util.HashSet;

class Permutation {
    static void display(String str, String res, HashSet<String> set) {
        if (str.length() == 0) {
            if (!set.contains(res)) {
                System.out.println(res);
                set.add(res);
            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            display(ros, res + ch, set);
        }
    }

    public static void main(String args[]) {
        String a = "AABC";
        HashSet<String> set = new HashSet<>();
        display(a, "", set);
    }
}
