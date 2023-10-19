// class 구슬을나누는경우의수 {
//     public int factorial(int num){
//         int result = 1;
//         while(num != 0)
//             result *= num--;

//         return result;

//     }
//     public int solution(int balls, int share) {
//         int answer = 0;
//         answer = factorial(balls)/factorial(balls-share)/factorial(share);

//         return answer;
//     }
// } // 수가 long 보다 커져서 변수에 담을 수가 없음. big Integer를 써야함

class 구슬을나누는경우의수 {
    public int solution(int balls, int share) {
        return combination(balls,share);
    }

    public int combination(int n,int r){
        if(n == r || r == 0) return 1;
        return combination(n-1,r) + combination(n-1,r-1);
    }


}
