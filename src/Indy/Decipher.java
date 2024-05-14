package Indy;

public class Decipher {

    public static String decrypt(String input){
        int halfLength = input.length() /2;
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(input.substring(5, 5+halfLength));
        while (strBuilder.indexOf("@#?") != -1){
            int location = strBuilder.indexOf("@#?");
            strBuilder.replace(location, location+3, " ");
        }
        return strBuilder.reverse().toString();
    }

    public static void main(String[] args){
        String[] encrypted = {
                "0@sn9sirppa@#?ia'jgtvryko1",
                "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
                "aopi?sedohtém@#?sedhtmg+p9l!\"."
        };
        for (String crypt: encrypted ){
            System.out.println(decrypt(crypt));
        }
    }
}
