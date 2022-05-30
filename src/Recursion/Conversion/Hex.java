package Recursion.Conversion;

public class Hex {

    public String toHex(int num){

        if (Math.abs(num) < 16){ // abs to handle negative values
            return num + "";
        }

        String result = "";
        int remainder = Math.abs(num) % 16; // abs to handle negative values
        result = toHex(num/16) + ((remainder>=10)? (char)(remainder-10+'A')+"":remainder);
        return result;
    }

    public static void main(String[] args) {
        Hex h = new Hex();
        System.out.println(h.toHex(19));
    }
}
