package com.zcedu.homework;

public class homework02 {
    //9.求 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+..+100)的结果
    // 主函数main开始
    public static void main(String[] args) {
        int layer, individual, sum2 = 0;
        int layerNum = 100;//设定要加的个数
        //制定多少组多项式相加
        for(layer = 1; layer <= layerNum; layer++){
            int sum1 = 0;//初始化sum1,每次循环完一组让数字重新从1开始加
            //判断是否是第一个数字，若是则赋值1给sum1并且输出一个纯数字
            if (layer == 1){
                sum1 = 1;
                System.out.print(sum1 + "+");
            }else {//否则输出模板为'(* + * +...+ *)+的多项式'
                System.out.print("(");
                //制定一个循环用于输出每组所需要的数字
                for (individual = 1; individual <= layer; individual++) {
                    sum1 += individual;//每次让从1到该层的数字相加
                    //若是到该层的最后则不输入'+'
                    if (individual < layer)
                        System.out.printf("%d+", individual);
                    else
                        System.out.printf("%d", individual);
                }//若到最后一层则不输入'+'
                if(layer == layerNum)
                    System.out.print(")");
                else
                    System.out.print(")+");
            }sum2 += sum1;//将每一层所得的数相加
        }
        System.out.println("="+sum2);//输出最后的得数
        System.out.println("所以结果为:"+sum2);
    }//主函数结束
}
