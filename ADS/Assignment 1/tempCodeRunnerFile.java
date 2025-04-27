    if (Character.isLetter(c)) {
            if ("aeiou".indexOf(c) != -1) {
                v++;
            } else {
                c2++;
            }
        }
    }    
    for (int i = 0; i < str2.length(); i++) { 
        char c1=str2.charAt(i);   
        if (Character.isLetter(c1)) {
            if ("aeiou".indexOf(c1) != -1) {
                v++;
            } else {
                c2++;
            }
        }