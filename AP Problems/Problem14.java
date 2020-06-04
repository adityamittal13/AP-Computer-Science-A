// Page 199 of AP Computer Science A Course and Exam Description

2) a)
public static int getCheck(int num){
    int sum = 0;
    
    int x = num;
    int length = 0;
    while (x != 0){
        x /= 10;
        length++;
    }
    
    int multiplier = 7-length+1;
    x = num;
    while (x != 0){
        int remainder = x % 10;
        x /= 10;
        sum += multiplier * remainder;
        multiplier++;
    }
    
    return sum % 10;
}

b)
public static boolean isValid(int numWithCheckDigit){
    return (getCheck(numWithCheckDigit/10) == (numWithCheckDigit % 10));
}
