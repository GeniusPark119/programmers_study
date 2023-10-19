class 외계어사전 {
    public int solution(String[] spell, String[] dic) {
        return isExist(spell,dic);
    }
    public int isExist(String[] spell, String[] dic){
        int len = spell.length;
        int ans = 2;
        for(String str : dic){
            if(str.length()!=len) continue;
            ans = 1;
            for(String al : spell){
                int cnt = 0;
                for(int i=0;i<len;i++){
                    if(str.charAt(i)==al.charAt(0)) cnt++;
                }
                if(cnt!=1) {
                    ans = 2;
                    break;
                }
            }
            if(ans == 1) return 1;
        }
        return 2;
    }
}