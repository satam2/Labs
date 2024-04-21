public class lab2 {
    public boolean isAnagram(String s, String t){
        // edge cases, if one is null, or both are null
        if(t==null && s==null)
            return true;
        if((t==null && s!=null) || (t!=null && s==null) || t.length()!=s.length())
            return false;
    
        for(int i = 0; i < s.length(); i++){
            if(!t.contains((""+s.charAt(i))))
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        // lab2 test = new lab2();
        // String s = null;
        // String t = null;
        // boolean result = test.isAnagram(s, t);
        // System.out.println(s+" and " + t +" are anagrams: " + result);
    }
}
