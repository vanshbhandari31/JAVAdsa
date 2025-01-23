public class bitManipulation {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;
        // get bit
        if (((bitMask & n) == 0)) {
            System.out.println("bit was 0 ");
        } else {
            System.out.println("bit was 1 ");

        }

        // set bit
        int newNumber = bitMask | n;
        System.out.println(newNumber);

        //clear bit
        int newMask=1<<2;
        int newBitMask=~newMask;
        int newNumber2=newBitMask&n;

        System.out.println(newNumber2);
            }
        }



