1) a)

public double getScore(ArrayList<String> key){
    double score = 0.0;
    for (int i = 0; i < key.size(); i++){
        if (!answers.get(i).equals("?")){
            if (answers.get(i).equals(key.get(i))){
                score += 1;
            } else {
                score -= 0.25;
            }
        }
    }
    return score;
}

b)
public String highestScoringStudent(ArrayList<String> key){
    double maxScore = Integer.MIN_VALUE;
    String bestStudent = sheets.get(0).getName();
    for (int i = 0; i < key.size(); i++){
        double studentScore = sheets.get(i).getScore(key);
        if (studentScore > maxScore){
            maxScore = studentScore;
            bestStudent = sheets.get(i).getName();
        }
    }
    return bestStudent;
}

