public boolean mixStart(String str)
{
    if(str.length() < 3) return false;
    if(str.substring(1, 3).equalsIgnoreCase("ix")) return true;
    return false;
}
