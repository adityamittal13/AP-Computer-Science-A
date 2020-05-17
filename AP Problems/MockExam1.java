1) a)

public boolean record(int score){
    for (int i = 0; i < scoreList.size(); i++){
        if (scoreList.get(i).getScore() == score){
            scoreList.get(i).increment();
            return true;
        }
    }
    
    for (int i = 0; i < scoreList.size(); i++){
        if (scoreList.get(i).getScore() > score){
            if (i == 0)
                scoreList.add(0, new ScoreInfo(score))
            else
                scoreList.add(i-1, new ScoreInfo(score))
            return false;
        }
    }
    scoreList.add(new ScoreInfo(score))
    return false;
}

b)
public void returnScores(int[] stuScores){
    for (int i = 0; i < stuScores.length; i++){
        record(stuScores[i]);
    }
}

c) 
public double getSeniorPercent(int score){
}

For ScoreInfo, you would have to add a private integer that would say the number of seniors. When you construct this class,
you would have to put in a boolean value to say whether he/she was a senior or not. Then, inside the constructor, we would increase
the number of seniors for that score. Inside getSeniorPercent, you would iterate through the array list to find the right score, and then
return the number of seniors divided by the number of students as a double.
