class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] sorted = score.clone();
        Arrays.sort(sorted);
        String [] answer = new  String[n];
        for (int i =0 ; i<score.length; i++){
             int rank = 1;
        for (int j = n - 1; j >= 0; j--) {

        if (score[i] == sorted[j]) {
            if (rank==1){
                answer[i]= "Gold Medal";
            }
            else if (rank ==2){
                answer[i]= "Silver Medal";
            }
            else if(rank==3){
                answer[i]= "Bronze Medal";
            }
            else {
                answer[i] = String.valueOf(rank);
            }
            break;
        }
rank++;
        }
        }
        return answer;
        }
} 
    
