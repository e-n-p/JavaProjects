package Indy;

import java.util.Arrays;

public class Movies {
    public static void main(String[] args) {
        String[] filmTitles = {
                "Raiders of the Lost Ark",
                "Indiana Jones and the Temple of Doom",
                "Indiana Jones and the Last Crusade"
        };
        String[][] filmActors = {
                {"Harrison Ford", "Karen Allen", "Paul Freeman"},
                {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"},
                {"Harrison Ford", "Sean Connery", "Alison Doody"}
        };

        for (int i=0;i<filmTitles.length;i++){
            System.out.println("In " + filmTitles[i] + ", the main actors are: " + Arrays.toString(filmActors[i]));
        }
    }
}
