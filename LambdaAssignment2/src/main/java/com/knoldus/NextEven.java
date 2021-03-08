package com.knoldus;

public class NextEven implements Even{
    @Override
    public long FindNextEven(long x) {
        Even result = (x1) -> (x1%2 ==0) ? x1+2 : x1+1;
       return result.FindNextEven(x);
    }

}
