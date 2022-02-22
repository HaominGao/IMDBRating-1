package edu.bristol;

public class IMDBRating
{
    private float currentAverage = 0;
    private int ratingCount = 0;
    private float falseNewRating = -1;

    public float addNewRating(int newRating)
    {
        if((newRating > 10)||(newRating < 0)){
            return falseNewRating;
        }
        int previousTotal = (int) (currentAverage * ratingCount);
        int newTotal = previousTotal + newRating;
        ratingCount++;
        currentAverage = newTotal / ratingCount;
        return currentAverage;
    }
}
