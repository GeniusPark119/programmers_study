class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = {};
        
        int[][] arr1_bin = new int[n][n];
        int[][] arr2_bin = new int[n][n];
        
        answer = new String[n];
        
        for(int i = 0;i<n;i++){
            
            int num1 = arr1[i];
            int num2 = arr2[i];
            
            for(int j=0;j<n;j++){
                if(j!=n-1){
                    arr1_bin[i][n-1-j] = num1%2;
                    num1 /=2;
                }else
                    arr1_bin[i][n-1-j] = num1;
                } 
            for(int j=0;j<n;j++){
                if(j!=n-1){
                    arr2_bin[i][n-1-j] = num2%2;
                    num2 /=2;
                }else
                    arr2_bin[i][n-1-j] = num2;
                } 
            
            }

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(arr1_bin[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        for(int i=0;i<n;i++){
            answer[i]="";
            for(int j=0;j<n;j++){
                
                if(arr1_bin[i][j]==1 || arr2_bin[i][j]==1){
                    answer[i]+="#";
                }else{
                    answer[i]+=" ";
                }
                
            }
        }
        return answer;
    }
}