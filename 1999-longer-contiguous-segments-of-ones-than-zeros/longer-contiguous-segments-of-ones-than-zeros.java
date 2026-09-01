class Solution {
    public boolean checkZeroOnes(String s) {
       int ones = 0;
       int zeros = 0;

       int maxOnes = 0;
       int maxZeros = 0;

       for(int i =0; i< s.length(); i++){
        if(s.charAt(i) == '1'){
            ones ++;
            zeros = 0;
        }
        else{
            zeros++;
            ones =0;
        }
        maxOnes=Math.max(maxOnes,ones);
        maxZeros = Math.max(maxZeros,zeros);
       }
       return maxOnes>maxZeros;
    }
}

