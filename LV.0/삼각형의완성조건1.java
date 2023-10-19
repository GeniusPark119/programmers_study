
class 삼각형의완성조건1 {
    public int solution(int[] sides) {
        return findTriangle(sides[0],sides[1]);
    }
    public int findTriangle(int a,int b){
        if(a==b) return a+b-1;
        else{
            int big = Math.max(a,b);
            int small = Math.min(a,b);
            return 2*small -1;
        }
    }
}