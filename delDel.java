public String delDel(String str)
{
    if(str.length() <= 3) return str;

    int delIndex = str.indexOf("del");

    if(delIndex == 1) return str.substring(0, delIndex) + str.substring(delIndex +3);

    return str;
}
