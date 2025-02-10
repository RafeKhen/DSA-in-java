public class clear_ith_bit {

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        // another way
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        // System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));

    }
}
