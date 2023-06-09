package day08;

public class Vowels {

    public static void main(String[] args){
        String s="ManojKumar";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                count++;
        }
        System.out.println(count);
    }
}
