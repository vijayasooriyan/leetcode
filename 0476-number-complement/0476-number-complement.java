class Solution {
    public int findComplement(int num) {
         int numBits = Integer.toBinaryString(num).length();
         int mask = (1 << numBits) - 1;
         return num ^ mask;
    }
}