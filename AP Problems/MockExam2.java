2) a)

private String recombine(String word1, String word2){
    String firstpart = word1.substring(0, (word1.length/2));
    String secondpart = word2.substring(word2.length/2);
    return firstpart + secondpart;
}

b)

private boolean checkValidLength(String word1, String word2){
    ...
}

First, you would check if you would call recombine with the two parameters being word1 and word2.
You would then take that length and check whether it is less than the length of either word1 or word2.
