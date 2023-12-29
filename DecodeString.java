import java.util.*;
/**
 * DecodeString
 */
public class DecodeString {

    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }
    public static String decodeString(String s) {
        Stack<Integer>numStack=new Stack<>();
        Stack<StringBuilder>strBuild=new Stack<>();
        StringBuilder str = new StringBuilder();
        int num=0;
        for(char c:s.toCharArray()){
            if(c>='0' && c<='9'){
                num=num*10 +c -'0';
            }
            else if(c=='['){
                strBuild.push(str);
                str=new StringBuilder();
                numStack.push(num);
                num=0;
            }else if(c==']'){
                StringBuilder temp=str;
                str=strBuild.pop();
                int count=numStack.pop();
                while(count-->0){
                    str.append(temp);
                }
            }else{
                str.append(c);
            }
        }
        return str.toString();
    }   
   
   
   
   
   
   
}  
//     public static String decodeString(String s) {
//         int k;
//         StringBuilder str= new StringBuilder();
//         StringBuilder encStr= new StringBuilder();
//         Boolean flag=true;
//         for(int i=s.length()-1;i>=0;i--){
//             char element=s.charAt(i);
//             if(element=='[') {
//                 flag=false;
//             continue;}
//             else if(element==']') {
//                 flag=true;
//             encStr= new StringBuilder();

//             continue;}
//             if(flag) {
//                 encStr.insert(0,element);
//             }
//             if(Character.isDigit(element)){

//                 k=Character.getNumericValue(element);
//                 flag=false;int j=0;
//                 while(j<k){
//                     str.insert(0,encStr);
//                     j++;
//                 }
                
//             }
            
//         }
//         return str.toString();
//     }
// }