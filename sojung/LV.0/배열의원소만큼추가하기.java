import java.util.ArrayList;
public class 배열의원소만큼추가하기 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : arr){
            for(int i=0;i<x;i++){
                list.add(x);
            }
        }
        answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

}
