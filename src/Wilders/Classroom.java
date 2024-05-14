package Wilders;

public class Classroom {

    public static void main(String[] args){
        Wilder guy = new Wilder("guy", false);
        Wilder jeanLuc = new Wilder("Jean-Luc", true);

        System.out.println(guy.whoAmI());
        System.out.println(jeanLuc.whoAmI());

    }
}
