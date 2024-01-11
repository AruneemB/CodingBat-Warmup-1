public int diff21(int n)
{
    int absDiff = Math.abs(n - 21);

    if(n > 21)
    {
        absDiff *= 2;
    }

    return absDiff;
}
