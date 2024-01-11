public boolean stringE(String str)
{
    int eCounter = 0;
    for(int i = 0; i < str.length(); i++)
    {
        if(str.charAt(i) == 'e') eCounter++;
    }
    return(eCounter >= 1 && eCounter <= 3);
}
