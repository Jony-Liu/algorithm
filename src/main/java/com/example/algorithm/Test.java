package com.example.algorithm;

/**
 * @author Jony-Liu
 * @date 2020/04/23 17:33
 */
public class Test {
    public static void main(String[] args) {
        int rmax = 10,cmax =10;
        int[][] ints = new int[rmax][cmax];
        int i = 1;
        int r_index = 0;
        int c_index = 0;
        //一次循环八次
        int flag_1 = 1;// 1:列+，2：列-
        int flag = 1;//1:列 2 ： 行
        int flag_2 = 1;// 1:行+ 行-1 行- 行+1
        while (i<rmax*cmax){
                if(flag==1){
                    while (r_index<rmax&&c_index<cmax&&r_index>-1&&c_index>-1){
                            if(i==1){
                                r_index--;
                            }
                            if (flag_1==1){
                                r_index++;
                                if(r_index<rmax&&c_index<cmax&&r_index>-1&&c_index>-1){
                                    if(ints[r_index][c_index]==0){
                                        ints[r_index][c_index] = i;
                                    }else{
                                        r_index--;
                                        break;
                                    }
                                }else{
                                    r_index--;
                                    break;
                                }
                            }else {
                                r_index--;
                                if(r_index<rmax&&c_index<cmax&&r_index>-1&&c_index>-1){
                                    if(ints[r_index][c_index]==0){
                                        ints[r_index][c_index] = i;
                                    }else{
                                        r_index++;
                                        break;
                                    }
                                }else{
                                    r_index++;
                                    break;
                                }
                            }
                        i++;

                    }
                    flag =2;
                    flag_1 = (flag_1+1)%2;
                    if(flag_1==0){
                        flag_1=2;
                    }
                }else{
                    while (r_index<rmax&&c_index<cmax&&r_index>-1&&c_index>-1){
                        if(flag_2==1){
                            c_index++;
                            if(r_index<rmax&&c_index<cmax&&r_index>-1&&c_index>-1){
                                if(ints[r_index][c_index]==0){
                                    ints[r_index][c_index]=i;
                                }else{
                                    c_index--;
                                    break;
                                }
                            }else{
                                c_index--;
                                break;
                            }


                        }else if (flag_2==2){
                            c_index--;
                            if(r_index<rmax&&c_index<cmax&&r_index>-1&&c_index>-1){
                                if(ints[r_index][c_index]==0){
                                    ints[r_index][c_index]=i;
                                    i++;
                                    break;
                                }else{
                                    break;
                                }
                            }else{
                                c_index++;
                                break;
                            }
                        }else if (flag_2==3){
                            c_index--;
                            if(r_index<rmax&&c_index<cmax&&r_index>-1&&c_index>-1){
                                if(ints[r_index][c_index]==0){
                                    ints[r_index][c_index]=i;
                                }else {
                                    c_index++;
                                    break;
                                }
                            }else{
                                c_index++;
                                break;
                            }
                        }else {
                            c_index++;
                            if(r_index<rmax&&c_index<cmax&&r_index>-1&&c_index>-1){
                                if(ints[r_index][c_index]==0){
                                    ints[r_index][c_index]=i;
                                    i++;
                                    break;
                                }else {
                                    c_index--;
                                    break;
                                }
                            }else{
                                c_index--;
                                break;
                            }
                        }
                        i++;
                    }
                    flag =1;
                    flag_2 = (flag_2+1)%4;
                    if(flag_2==0){
                        flag_2=4;
                    }
                }
        }
        for (int j = 0; j < rmax; j++) {
            for (int k = 0; k < cmax ; k++) {
                System.out.print(ints[j][k]+"\t");
            }
            System.out.println();
        }
    }
}
