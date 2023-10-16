class 문자반복출력하기 {
    public String solution(String my_string, int n) {
        String answer = "";
        int len = my_string.length();
        for(int i=0;i<len;i++){
            for(int j=0;j<3;j++){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}