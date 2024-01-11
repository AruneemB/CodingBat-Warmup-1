public String everyNth(String str, int n)
{
    String everyNthOutput = "";
    for(int i = 0; i < str.length(); i++)
    {
        if(i % n == 0) everyNthOutput += str.substring(i, i + 1);
    }
    return everyNthOutput;
}
