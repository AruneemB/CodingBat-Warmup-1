public int close10(int a, int b)
{
    if(a == b) return 0;
    int absValA = Math.abs(a -10);
    int absValB = Math.abs(b -10);
    if(absValA < absValB) return a;
    if(absValA > absValB) return b;
    return 0;
}
