public String missingChar(String str, int n)
{
    String missingCharOutput = "";
    for(int i = 0; i < str.length(); i++)
    {
        if(i != n) missingCharOutput += str.substring(i, i + 1);
    }
    return missingCharOutput;
}
