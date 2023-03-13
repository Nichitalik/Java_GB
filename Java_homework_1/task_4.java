public class task_4 {
    static int[] split_num(String s, int len) {
        int[] result = new int [len];
        while (true) {
            if (s.length() < len) s = "?" + s;
            else break;
        }

        for (int i = 0; i < result.length; i++) {
            try {
                result[i] = Integer.parseInt(s.substring(i, i + 1));
            } catch (Exception E) {
                result[i] = 0;
            }
        }
        return result;
    }

    static String output(int[] q, int[] w, int[] e) {
        String result = "";



        return result;
    }



    static String equation(int[] q, int[] w, int[] e)
    {
        String result = "";
        int len_q = q.length;
        int len_w = w.length;
        int len_e = e.length;
        if (len_q > len_e) return("Нет решений");
        else if (len_w > len_e) return("Нет решений");
        int[] x = new int[len_e];
        for (int i = 0; i < len_e; i++) {
            x[i] = q[i] + w[i];

        }
        


        return result;
    }



    //---------------------------------


    static boolean[] mask(String s) 
    {
        boolean[] result = new boolean[s.length()];
        for (int i = 0; i < result.length; i++) {
            if (s.charAt(i) == '?') result[i] = false;
            else result[i] = true;
        }
        return result;
    }

    static String calc(String q, String w, String e)
    {
        String result = "Нет решений";

        boolean[] mask_q = mask(q);
        boolean[] mask_w = mask(w);
        boolean[] mask_e = mask(e);

        int int_q, int_w, int_e;

        char[] digit = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (int i = 0; i < mask_q.length; i++) {
            for (int j = 0; j < mask_w.length; j++) {
                for (int j2 = 0; j2 < mask_e.length; j2++) {

                    for (char c : digit) {
                        if(mask_q[i] == false)
                        {
                            q = repl(q, c, i);
                            int_q = Integer.parseInt(q);
                        }

                        for (char k : digit) {
                            if(mask_q[i] == false)
                            {
                                w = repl(w, k, j);
                                int_w= Integer.parseInt(w);
                            }
                            for (char l : digit) {
                                if (mask_e[j2] == false)
                                {
                                    e = repl(e, l, j2);
                                    int_e = Integer.parseInt(e);
                                    return String.format("%d + %d = %d", q, w, e);
                                }
                                
                            }
                        }
                    }

                }
            }
        }

        return result;
    }


    static String repl(String s, char c, int i)
    {
        char[] cahr_s = s.toCharArray();
        cahr_s[i] = c;
        return String.valueOf(cahr_s);
    }



    public static void main(String[] args) {
        String input = "1? + 1?3 = ?36";
        String s1 = input.split(" ")[0];
        String s2 = input.split(" ")[2];
        String sum = input.split(" ")[4];
        
        System.out.println(calc(s1, s2, sum));
    }
}
