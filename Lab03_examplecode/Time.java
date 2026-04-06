class Time{
    public static void main(String[] args){
	
	System.out.println(timeConversion(args[0]));
    }

    public static String timeConversion(String s) {
    // Write your code here
        char c = s.charAt(8);
        int num = Integer.parseInt(s.substring(0,2));
        if(c == 'P' && num != 12)
            num+=12;
        if(c == 'A' && num == 12)
            num = 0;
        
        String snum = (num < 10) ? ("0"+num) : ("" + num);
        return snum + s.substring(2,8);
    }
}
