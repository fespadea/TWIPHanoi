package com.company;
import java.util.*;
/**
 * Created by fs279 on 1/17/17.
 */
public class Hanoi {
    public static int step = 0;
    public static void solve(int numb){
        if(numb%2==0){
            int loop = 0;
            int a = numb;
            int b = 0;
            int c = 0;
            ArrayList<Integer> as = new ArrayList<Integer>();
            ArrayList<Integer> bs = new ArrayList<Integer>();
            ArrayList<Integer> cs = new ArrayList<Integer>();
            as.add(0);
            bs.add(0);
            cs.add(0);
            for(int x = numb; x > 0; x--){
                as.add(x);
            }
            for(int x = 0; x < Math.pow(2,numb)-1; x++) {
                step++;
                if(loop == 3){
                    loop = 0;
                }
                if(loop == 0) {
                    if(a>0 && (as.get(as.size()-1) < bs.get(bs.size()-1) || b==0)) {
                        System.out.println(step + ": Move one disk from tower 1 to 2");
                        a--;
                        bs.add(as.get(as.size()-1));
                        as.remove(as.size()-1);
                        b++;
                    }
                    else {
                        System.out.println(step + ": Move one disk from tower 2 to 1");
                        a++;
                        as.add(bs.get(bs.size()-1));
                        bs.remove(bs.size()-1);
                        b--;
                    }
                }
                else if(loop == 1){
                    if(c>0 && (cs.get(cs.size()-1) < as.get(as.size()-1) || a==0)){
                        System.out.println(step + ": Move one disk from tower 3 to 1");
                        a++;
                        as.add(cs.get(cs.size()-1));
                        cs.remove(cs.size()-1);
                        c--;
                    }
                    else {
                        System.out.println(step + ": Move one disk from tower 1 to 3");
                        a--;
                        cs.add(as.get(as.size()-1));
                        as.remove(as.size()-1);
                        c++;
                    }
                }
                else if(loop == 2){
                    if(c>0 && (cs.get(cs.size()-1) < bs.get(bs.size()-1) || b==0)){
                        System.out.println(step + ": Move one disk from tower 3 to 2");
                        b++;
                        bs.add(cs.get(cs.size()-1));
                        cs.remove(cs.size()-1);
                        c--;
                    }
                    else {
                        System.out.println(step + ": Move one disk from tower 2 to 3");
                        b--;
                        cs.add(bs.get(bs.size()-1));
                        bs.remove(bs.size()-1);
                        c++;
                    }
                }
                loop++;
            }
        }
        else if(numb%2==1){
            int loop = 0;
            int a = numb;
            int b = 0;
            int c = 0;
            ArrayList<Integer> as = new ArrayList<Integer>();
            ArrayList<Integer> bs = new ArrayList<Integer>();
            ArrayList<Integer> cs = new ArrayList<Integer>();
            as.add(0);
            bs.add(0);
            cs.add(0);
            for(int x = numb; x > 0; x--){
                as.add(x);
            }
            for(int x = 0; x < Math.pow(2,numb)-1; x++) {
                step++;
                if(loop == 3){
                    loop = 0;
                }
                if(loop == 1) {
                    if(a>0 && (as.get(as.size()-1) < bs.get(bs.size()-1) || b==0)) {
                        System.out.println(step + ": Move one disk from tower 1 to 2");
                        a--;
                        bs.add(as.get(as.size()-1));
                        as.remove(as.size()-1);
                        b++;
                    }
                    else {
                        System.out.println(step + ": Move one disk from tower 2 to 1");
                        a++;
                        as.add(bs.get(bs.size()-1));
                        bs.remove(bs.size()-1);
                        b--;
                    }
                }
                else if(loop == 0){
                    if(c>0 && (cs.get(cs.size()-1) < as.get(as.size()-1) || a==0)){
                        System.out.println(step + ": Move one disk from tower 3 to 1");
                        a++;
                        as.add(cs.get(cs.size()-1));
                        cs.remove(cs.size()-1);
                        c--;
                    }
                    else {
                        System.out.println(step + ": Move one disk from tower 1 to 3");
                        a--;
                        cs.add(as.get(as.size()-1));
                        as.remove(as.size()-1);
                        c++;
                    }
                }
                else if(loop == 2){
                    if(c>0 && (cs.get(cs.size()-1) < bs.get(bs.size()-1) || b==0)){
                        System.out.println(step + ": Move one disk from tower 3 to 2");
                        b++;
                        bs.add(cs.get(cs.size()-1));
                        cs.remove(cs.size()-1);
                        c--;
                    }
                    else {
                        System.out.println(step + ": Move one disk from tower 2 to 3");
                        b--;
                        cs.add(bs.get(bs.size()-1));
                        bs.remove(bs.size()-1);
                        c++;
                    }
                }
                loop++;
            }
        }
    }
}
