class Solution {
    public int minimumChairs(String s) {
        int chairs = 0;
        int maxChairs = 0;
        for(int i=0; i< s.length(); i++){
            if(s.charAt(i) == 'E'){
                chairs ++;
            }
            else{
                chairs --;
            }
            if(chairs > maxChairs){
                maxChairs = chairs;
            }
        }
        return maxChairs;
    } }