public String startOz(String str)
{
    if(str.length() >= 2 && str.substring(0, 2).equalsIgnoreCase("oz")) return "oz";
    if(str.length() >= 1 && str.substring(0, 1).equalsIgnoreCase("o")) return "o";
    if(str.length() >= 1 && str.substring(1, 2).equalsIgnoreCase("z")) return "z";
    return "";
}
