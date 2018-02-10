



public int martingale()
{
    int money = 1000;
    int target = 1200;
    int bet = 10;
    while(money>bet)
    {
        boolean win = play(); // Assuming that the play function is implemented elsewhere.
        if(win)
        {
            money += bet;
            bet = 10;
        }
        else 
        {
            money -= bet;
            bet *= 2;
        }
        if (money >= target)
        {
            break; //break if money value target has been reached or exceeded
        }
    }
    return money;
}
