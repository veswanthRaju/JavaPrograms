public class MyClass {
    public static void main(String args[]) {
        
       int[] arry = new int[]{ 4, 10, 2, 8 }; 

        for(int i=0; i< arry.length-1 ; i++) {
              boolean flag = false;
            for(int j = i+1 ; j < arry.length; j++) {
                if(arry[i] < arry[j]) {
                    System.out.println(arry[i] + " --> " + arry[j]);
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                System.out.println(arry[i] + " --> "+ -1);
            }
        }
        System.out.println(arry[arry.length-1] + " --> "+ -1);
    }
}