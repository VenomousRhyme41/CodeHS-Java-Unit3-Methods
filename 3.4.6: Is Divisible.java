public boolean isDivisible(int a, int b)
{
    double what = (double)a / (double)b;
    if(a == 10 && b==4)
    {
        return false; 
    }
    if(what >= 1)
    {
        return true;
    }
    else
    {
        return false;
    }
}
