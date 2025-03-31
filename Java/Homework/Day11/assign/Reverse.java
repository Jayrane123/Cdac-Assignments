//method 1
// class Reverse{
// 	public static void main(String args[]){
// 		String a="ABCD";
// 		StringBuilder s=new StringBuilder(a);
// 		//s.append(a);
// 		s.reverse();
// 		System.out.println(s);
// 	}
// }

//method 2
class Reverse{
	public static void main(String args[]){
		String a="ABCD";
		StringBuffer s=new StringBuffer();
		s.append(a);
		s.reverse();
		System.out.println(s);
	}
}

//method 3
// class Reverse{
	// public static void main(String args[]){
		// String a="ABCD";
		// System.out.println("Initial String");
		// System.out.println(a);
		// System.out.println("new String");
		// char[] ca = a.toCharArray();
		// for(int i=0;i<ca.length;i++){
			// System.out.print(ca[ca.length-i-1]);
		// }
	// }
// }

// method 4
// class Reverse{
	// public static void main(String args[]){
		// String s = "ABCD"; 
        // String r = "";
        // char ch;

        // for (int i = 0; i < s.length(); i++) {             
            // ch = s.charAt(i);
            // r = ch + r; //always new string obj created it will add at front string 1)A 2)BA 3)CBA 4)DCBA
			//   //r = r + ch;     ------------//then it print same string 1)A 2)AB 3)ABC 4)ABCD
        // }
      
        // System.out.println(r);
	// }
// }

//method 5
// class Reverse{
// 	public static void main(String args[]){
// 		 String s = "Geeks";

        
//         byte[] arr = s.getBytes();
// 		for(int a:arr){
// 			System.out.println(a);
// 		}
        
//         byte[] res = new byte[arr.length];      
//         for (int i = 0; i < arr.length; i++)
//             res[i] = arr[arr.length - i - 1];

//         System.out.println(new String(res)); // new String(res) can convert byteArr to String
// 	}
// }

