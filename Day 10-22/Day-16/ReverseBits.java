//https://practice.geeksforgeeks.org/problems/reverse-bits3556/0
class Solution {
    static long reversedBits(Long X) {
        String binary = Long.toBinaryString(X);

        // Pad the binary representation with leading zeros to make it 32 bits
        String paddedBinary = String.format("%32s", binary).replace(' ', '0');

        StringBuilder reversedBinary = new StringBuilder(paddedBinary).reverse();
        long decimal = Long.parseLong(reversedBinary.toString(), 2);
        return decimal;
    }
}