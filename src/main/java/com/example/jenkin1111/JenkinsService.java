package com.example.jenkin1111;

public class JenkinsService {

    public int  hap(int n){
        int result = 1;
        for(int i=2; i<=n; i++){
            result += i;
        }
        return result;
    }
}
