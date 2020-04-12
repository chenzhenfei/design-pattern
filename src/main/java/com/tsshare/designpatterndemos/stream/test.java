package com.tsshare.designpatterndemos.stream;

/**
 * @author chenzhenfei
 * @title: test
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/4/130:20
 */
public class test {
    public static void main(String[] args) {
        int[] a = new int[]{0,3};
        int[] b = new int[]{1,6};
        int[] c = new int[]{0,1};
        int[] d = new int[]{1,8};
        double[] intersection = intersection(a, b, c, d);
        for (int i = 0; i <intersection.length ; i++) {
            System.out.print(intersection[i]+",");
        }
    }


    public static double[] intersection(int[] start1, int[] end1, int[] start2, int[] end2) {
        double[] line1 = calcAandB(start1, end1);
        double[] line2 = calcAandB(start2, end2);
        double[] ret = null;
        double x=0.0,y=0.0;
        double line1xM = Math.max(start1[0], end1[0]);
        double line2xm = Math.min(start2[0], end2[0]);
        double line1xm = Math.min(start1[0], end1[0]);
        double line2xM = Math.max(start2[0], end2[0]);
        double line1yM = Math.max(start1[1], end1[1]);
        double line2ym = Math.min(start2[1], end2[1]);
        double line1ym = Math.min(start1[1], end1[1]);
        double line2yM = Math.max(start2[1], end2[1]);

        if(line1[0]==null){ /**y=line1[1]**/
            if(line2[0]==null){ /**y =line2[1]**/
                if(line1[1]==line2[1]){
                    if(line1xM<line2xm||line1xm>line2xM){
                        return new double[]{};
                    }else{
                        y=line1[1];
                        x=Math.max(line1xm,line2xm);
                    }
                } else{
                    return new double[]{};
                }
            }else if(line2[1]==null){/**x=line2[0]**/
                if(line2[0]>=line1xm&&line2[0]<=line1xM){
                    x=line2[0];
                    y=line1[1];
                    return new double[]{x,y};
                }else{
                    return new double[]{};
                }
            }else{
                if(line2[0]>=line1xm&&line2[0]<=line1xM){
                    y=line1[1];
                    x=(y-line2[1])/line2[0];
                    return new double[]{x,y};
                }else{
                    return new double[]{};
                }
            }
        }else if(line1[1]==null){/**x=line1[0]**/
            if(line2[0]==null){ /** y=line2[1]**/
                if(line2xm<=line1[0]&&line2xM>=line1[0]){
                    x=line1[0];
                    y=line2[1];
                    return new double[]{x,y};
                }else{
                    return new double[]{};
                }
            }else if(line2[1]==null){/**x=line2[0]**/
                if(line1[1]==line2[1]){
                    if(line1yM<line2ym||line1ym>line2yM){
                        return new double[]{};
                    }else{
                        x=line1[0];
                        y=Math.max(line1ym,line2ym);
                    }
                } else{
                    return new double[]{};
                }
            }else{
                if(line1[0]>=line2xm&&line1[0]<=line2xM){
                    x=line1[0];
                    y=line2[0]*x+line2[1];
                    return new double[]{x,y};
                }else{
                    return new double[]{};
                }
            }
        }else{
            x = (line2[1] - line1[1])/(line1[0] - line2[0]);
            y = (line1[0] * line2[1] - line2[0] * line1[1]) / (line1[0] - line2[0]);

            if (line1xm <= x && x <= line1xM && line2xm <= x && x <= line2xM &&
                    line1ym <= y && y <= line1yM && line2ym <= y && y <= line2yM) {
                ret = new double[]{x, y};
            } else {
                ret = new double[]{};
            }
            return ret;
        }
    }

    //直线斜率和高度
    public static double[] calcAandB(int[] start, int[] end) {
        double a = 0.0, b = 0.0;
        if ((end[0] - start[0]) == 0) {
            a = end[0];
            b = null ;
        } else if ((end[1] - start[1]) == 0) {
            a = null;
            b = end[1] ;
        } else {
            a = (end[1] - start[1]) / (end[0] - start[0]);
            b = (end[0] * start[1] - start[0] * end[1]) / (end[0] - start[0]);
        }
        return new double[]{a, b};
    }
}
