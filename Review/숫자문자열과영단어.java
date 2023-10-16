class 숫자문자열과영단어{
    public int solution(String s){
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] nums = {"0","1","2","3","4","5","6","7","8","9"};
        
        for(int i=0;i<10;i++){
            s = s.replace(words[i],nums[i]);
        }
        int answer = Integer.valueOf(s);
        return answer;
  

  // replace 에대한 공부
  // string인변수.replace("a문자","b문자"); -> 특수문자도 된다.
  // string인변수.replaceALL("/","."); ->특수문자 안된다.
  // string인변수.replaceFirst("제일먼저나오는a문자","b문자")-> 제일먼저나오는 문자만 바꾸고 끝난다.