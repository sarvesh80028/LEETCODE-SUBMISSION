class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aliceStart = convert(arriveAlice);
        int aliceEnd = convert(leaveAlice);

        int bobStart = convert(arriveBob);
        int bobEnd = convert(leaveBob);

        int start = Math.max(aliceStart,bobStart);
        int end = Math.min(aliceEnd,bobEnd);

        return Math.max(0,end-start+1);
    }
    private int convert(String s){
        int day = Integer.parseInt(s.substring(3,5));
        int month = Integer.parseInt(s.substring(0,2));

        int[]daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        int totaldays = day;
        for(int i=0;i<month-1;i++){
            totaldays+= daysInMonth[i];
        }
        return totaldays;
    }
}