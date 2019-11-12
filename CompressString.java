public class MyClass {
    public static void main(String args[]) {
     String name = "aaabbbbcddddaa";
     int cnt = 1;
     StringBuilder sb = new StringBuilder();
     for(int i = 1; i< name.length(); i ++) {
         if(name.charAt(i) == name.charAt(i-1)) {
             cnt++;
         } else {
             sb.append(name.charAt(i-1)).append(cnt);
             cnt=1;
         }
     }
     
      sb.append(name.charAt(name.length()-1)).append(cnt);
      System.out.println("Compressed string is = " + sb.toString());
    }
}