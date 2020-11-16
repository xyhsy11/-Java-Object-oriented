package com.siyu.demo17;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/10/24 20:12
 *
 * 示例：
 */
public class AlgorithomTest {
    public static void main(String[] args) {
        String[] stalls = {null,null,null,null,null,null,null,null,null,null};
        String[] families = {"llama","uakari","yak","yak","gorilla","dog"};
        int[] familysizes = {4,5,4,2,3,5};
        System.out.println(fillFamilies(stalls,families,familysizes));


    }
    public static int fillFamilies(String[] stalls, String[] families, int[] familySizes) {
        int count = 0;//
        int countInv = stalls.length - 1;
        for(int i = 0;i< families.length;i++){
            if(i%2 == 0){
                if(familySizes[i] <= countInv - count){
                    for(int j = count; j < count+familySizes[i]; j++){
                        stalls[j] = families[i];
                        count++;

                    }
                }else{
                    for(int j = count; j < countInv;j++){
                        stalls[j] = null;
                        count++;
                    }
                }
            }else{
                if(familySizes[i]<=countInv - count){
                    for(int j = countInv; j > count;j--){
                        stalls[j] = families[i];
                        countInv--;
                    }
                }else{
                    for(int j = countInv; j > count;j--){
                        stalls[j] = null;
                        countInv--;
                    }
                }
            }
        }
        for(int i = 0;i < stalls.length;i++){
            if(stalls[i] == null){
                return i+1;
            }

        }
        return -1;

    }
}
