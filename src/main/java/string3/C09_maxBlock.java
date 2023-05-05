package string3;

public class C09_maxBlock {
    /*
    Question:

    Given a string, return the length of the largest "block" in the string.
    A block is a run of adjacent chars that are the same.

    maxBlock("hoopla") → 2
    maxBlock("abbCCCddBBBxx") → 3
    maxBlock("") → 0
    */
    public static void main(String[] args) {
        System.out.println(maxBlock("abbCCCddBBBxx"));
    }
    public static int maxBlock(String str) {
        int count=1;
        if(str.length()<1){
            return 0;
        }
        int len = str.length();
        int maxBlockLength = 0;
        int blockLength = 1;
        for (int i = 1; i < len; i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                blockLength++;
            } else {
                if (blockLength > maxBlockLength) {
                    maxBlockLength = blockLength;
                }
                blockLength = 1;
            }
        }
        // Check the last block
        if (blockLength > maxBlockLength) {
            maxBlockLength = blockLength;
        }

        return maxBlockLength;
    }

}
