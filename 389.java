class Solution {
    public char findTheDifference(String s, String t) {
        int sVal = 0;
        int tVal = 0;
        for(int i =0; i<s.length();i++){
            sVal += s.charAt(i);
        }

        for(int j=0;j<t.length();j++){
            tVal += t.charAt(j);
        }

        int difference = tVal - sVal;
        return (char)difference;

    }
}