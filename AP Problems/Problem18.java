//2019 APCSA FRQ #1

1) a)
public static int numberOfLeapYears(int year1, int year2){
    int count = 0;
    for (int i = year1; i <= year2; i++){
        if (isLeapYear(i))
            count++;
    }
    return count;
}

b)
public static int dayOfWeek(int month, int day, int year){
    int val = ((dayOfYear(month, day, year)%7) + firstDayOfYear(year)-1);
    if (val < 0)
        return 6;
    else
        return val%7;
}
