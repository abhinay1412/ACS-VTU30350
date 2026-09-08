class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            days[1] = 29;
        }
        int totalDays = 0;

        //years
        for(int i = 1971; i < year; i++){
            if(i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)){
                totalDays += 366;
            }
            else{
                totalDays += 365;
            }
        }

        //months
        for(int i = 0; i < month - 1; i++){
            totalDays += days[i];
        }

        //days
        totalDays += day - 1;

        String[] week = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        
        int index = totalDays % 7;
        return week[index];
    }
}