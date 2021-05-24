package clean_code.bai_tap.refactoring;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int scoreTeam1, int scoreTeam2) {
        String score = "";
        int tempScore=0;
        if (scoreTeam1==scoreTeam2)
        {
            switch (scoreTeam1)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (scoreTeam1>=4 || scoreTeam2>=4)
        {
            int minusResult = scoreTeam1-scoreTeam2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) {
                    tempScore = scoreTeam1;
                }
                else {
                    score+="-";
                    tempScore = scoreTeam2;
                }
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
