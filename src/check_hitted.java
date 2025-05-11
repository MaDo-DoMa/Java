import static java.lang.Character.toUpperCase;

public class check_hitted {
    int[][] field_of_placements = new int[8][8];
    int[] how_many_hits = new int[3];

    public void set_field_of_placements(int[][] field_of_placements) {
        this.field_of_placements = field_of_placements;
    }

    public int[] getHow_many_hits() {
        how_many_hits[0] = 0;
        how_many_hits[1] = 0;
        how_many_hits[2] = 0;
        return how_many_hits;
    }

    public String check(String stringField){
        String result; //answear
        char letter = stringField.charAt(0);
        letter = Character.toUpperCase(letter); //if user put small letter, make bigger
        int field_letter = (int)stringField.charAt(letter) - 41; //Because its letter we have to transfer this for number format
        int field_number = (int)stringField.charAt(1); //number place
        int which_one = field_of_placements[field_letter][field_number]; //which number of boat

        if(how_many_hits[which_one] == 3){ //check if work is worth doing it
            result = "This boat number " + which_one + " was already sunked!";
            return result;
        }

        if (field_of_placements[field_letter][field_number] == 0) {
            result = "Miss!";
            return result;
        }
        else {

            if(how_many_hits[which_one] == 2) {
                result = "Boat number: " + which_one + " was sunked!";
                how_many_hits[which_one]++;
            }
            else {
                how_many_hits[which_one] ++;
                result = "Boat number: " + which_one + " was hitted!";
            }
            return result;
        }
    }
}
